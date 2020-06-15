package mindustry.world.blocks.production;

import arc.Core;
import arc.struct.Array;
import arc.graphics.Color;
import arc.graphics.g2d.Draw;
import arc.graphics.g2d.TextureRegion;
import arc.math.Mathf;
import mindustry.entities.*;
import mindustry.entities.Effects.*;
import mindustry.entities.type.*;
import mindustry.graphics.Layer;
import mindustry.type.Liquid;
import mindustry.ui.Cicon;
import mindustry.world.Tile;
import mindustry.world.blocks.LiquidBlock;
import mindustry.world.meta.*;

import static mindustry.Vars.tilesize;
import static mindustry.Vars.world;

public class Pump extends LiquidBlock{
    protected final Array<Tile> drawTiles = new Array<>();
    protected final Array<Tile> updateTiles = new Array<>();

    public final int timerContentCheck = timers++;

    /** Pump amount, total. */
    protected float pumpAmount = 1f;

    public Pump(String name){
        super(name);
        layer = Layer.overlay;
        group = BlockGroup.liquids;
        floating = true;
        entityType = PumpEntity::new;
    }

    @Override
    public void load(){
    	super.load();
        liquidRegion = Core.atlas.find(name+"-liquid");
    }

    @Override
    public void setStats(){
        super.setStats();
        stats.add(BlockStat.output, 60f * pumpAmount, StatUnit.liquidSecond);
    }

    @Override
    public void draw(Tile tile){

    	PumpEntity entity = tile.ent();
    	Draw.rect(Core.atlas.find(name), tile.drawx(), tile.drawy());
        Draw.color(tile.entity.liquids.current().color);
        Draw.alpha(tile.entity.liquids.total() / liquidCapacity);
        Draw.rect(liquidRegion, tile.drawx(), tile.drawy());
        Draw.color();
        Draw.reset();
        Draw.rect(Core.atlas.find(name + "-rotator"), tile.drawx(), tile.drawy(), (entity.pumpTime * pumpAmount)*2);
        Draw.rect(Core.atlas.find(name + "-top"), tile.drawx(), tile.drawy());
    }

    @Override
    public void drawPlace(int x, int y, int rotation, boolean valid) {
        Tile tile = world.tile(x, y);
        if(tile == null) return;

        float tiles = 0f;
        Liquid liquidDrop = null;

        for(Tile other : tile.getLinkedTilesAs(this, tempTiles)){
            if(isValid(other)){
                liquidDrop = other.floor().liquidDrop;
                tiles++;
            }
        }

        if(liquidDrop != null){
            float width = drawPlaceText(Core.bundle.formatFloat("bar.pumpspeed", tiles * pumpAmount / size / size * 60f, 0), x, y, valid);
            float dx = x * tilesize + offset() - width/2f - 4f, dy = y * tilesize + offset() + size * tilesize / 2f + 5;
            Draw.mixcol(Color.darkGray, 1f);
            Draw.rect(liquidDrop.icon(Cicon.small), dx, dy - 1);
            Draw.reset();
            Draw.rect(liquidDrop.icon(Cicon.small), dx, dy);
        }
    }

    @Override
    public TextureRegion[] generateIcons(){
        return new TextureRegion[]{Core.atlas.find(name), Core.atlas.find(name + "-rotator"), Core.atlas.find(name + "-top")};
    }

    @Override
    public boolean canPlaceOn(Tile tile){
        if(isMultiblock()){
            Liquid last = null;
            for(Tile other : tile.getLinkedTilesAs(this, drawTiles)){
                if(other.floor().liquidDrop == null)
                    continue;
                if(other.floor().liquidDrop != last && last != null)
                    return false;
                last = other.floor().liquidDrop;
            }
            return last != null;
        }else{
            return isValid(tile);
        }
    }

    @Override
    public void update(Tile tile){

    	PumpEntity entity = tile.ent();
        float tiles = 0f;
        Liquid liquidDrop = null;

        if(tile.entity.cons.valid() && tile.entity.liquids.total() < liquidCapacity - 0.001f){
            entity.warmup = Mathf.lerpDelta(entity.warmup, 1f, 0.02f);
        }else{
            entity.warmup = Mathf.lerpDelta(entity.warmup, 0f, 0.02f);
        }
        entity.pumpTime += entity.warmup * entity.delta();
        if(isMultiblock()){
            for(Tile other : tile.getLinkedTiles(updateTiles)){
                if(isValid(other)){
                    liquidDrop = other.floor().liquidDrop;
                    tiles++;
                }
            }
        }else{
            tiles = 1f;
            liquidDrop = tile.floor().liquidDrop;
        }

        if(tile.entity.cons.valid() && liquidDrop != null){
            float maxPump = Math.min(liquidCapacity - tile.entity.liquids.total(), tiles * pumpAmount * tile.entity.delta() / size / size) * tile.entity.efficiency();
            tile.entity.liquids.add(liquidDrop, maxPump);
        }

        if(tile.entity.liquids.currentAmount() > 0f && tile.entity.timer.get(timerContentCheck, 10)){
            useContent(tile, tile.entity.liquids.current());
        }

        tryDumpLiquid(tile, tile.entity.liquids.current());
    }

    protected boolean isValid(Tile tile){
        return tile != null && tile.floor().liquidDrop != null;
    }

    public static class PumpEntity extends TileEntity{
        float pumpTime;
        float warmup;
    }

}
