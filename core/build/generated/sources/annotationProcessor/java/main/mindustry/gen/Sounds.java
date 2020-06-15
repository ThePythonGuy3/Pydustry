package mindustry.gen;

import arc.audio.Sound;

public class Sounds {
  public static Sound artillery = new arc.mock.MockSound();

  public static Sound back = new arc.mock.MockSound();

  public static Sound bang = new arc.mock.MockSound();

  public static Sound beam = new arc.mock.MockSound();

  public static Sound bigshot = new arc.mock.MockSound();

  public static Sound boom = new arc.mock.MockSound();

  public static Sound breaks = new arc.mock.MockSound();

  public static Sound build = new arc.mock.MockSound();

  public static Sound buttonClick = new arc.mock.MockSound();

  public static Sound click = new arc.mock.MockSound();

  public static Sound conveyor = new arc.mock.MockSound();

  public static Sound corexplode = new arc.mock.MockSound();

  public static Sound door = new arc.mock.MockSound();

  public static Sound drill = new arc.mock.MockSound();

  public static Sound empty = new arc.mock.MockSound();

  public static Sound explosion = new arc.mock.MockSound();

  public static Sound explosionbig = new arc.mock.MockSound();

  public static Sound fire = new arc.mock.MockSound();

  public static Sound flame = new arc.mock.MockSound();

  public static Sound flame2 = new arc.mock.MockSound();

  public static Sound laser = new arc.mock.MockSound();

  public static Sound laserbig = new arc.mock.MockSound();

  public static Sound machine = new arc.mock.MockSound();

  public static Sound message = new arc.mock.MockSound();

  public static Sound missile = new arc.mock.MockSound();

  public static Sound pew = new arc.mock.MockSound();

  public static Sound place = new arc.mock.MockSound();

  public static Sound press = new arc.mock.MockSound();

  public static Sound release = new arc.mock.MockSound();

  public static Sound respawn = new arc.mock.MockSound();

  public static Sound respawning = new arc.mock.MockSound();

  public static Sound shoot = new arc.mock.MockSound();

  public static Sound shootBig = new arc.mock.MockSound();

  public static Sound shootSnap = new arc.mock.MockSound();

  public static Sound shotgun = new arc.mock.MockSound();

  public static Sound spark = new arc.mock.MockSound();

  public static Sound splash = new arc.mock.MockSound();

  public static Sound spray = new arc.mock.MockSound();

  public static Sound thruster = new arc.mock.MockSound();

  public static Sound unlock = new arc.mock.MockSound();

  public static Sound wave = new arc.mock.MockSound();

  public static Sound windowHide = new arc.mock.MockSound();

  public static Sound none = new arc.mock.MockSound();

  public static void load() {
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/artillery.ogg" : "sounds/artillery.mp3", arc.audio.Sound.class).loaded = a -> artillery = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/back.ogg" : "sounds/back.mp3", arc.audio.Sound.class).loaded = a -> back = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/bang.ogg" : "sounds/bang.mp3", arc.audio.Sound.class).loaded = a -> bang = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/beam.ogg" : "sounds/beam.mp3", arc.audio.Sound.class).loaded = a -> beam = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/bigshot.ogg" : "sounds/bigshot.mp3", arc.audio.Sound.class).loaded = a -> bigshot = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/boom.ogg" : "sounds/boom.mp3", arc.audio.Sound.class).loaded = a -> boom = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/break.ogg" : "sounds/break.mp3", arc.audio.Sound.class).loaded = a -> breaks = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/build.ogg" : "sounds/build.mp3", arc.audio.Sound.class).loaded = a -> build = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/buttonClick.ogg" : "sounds/buttonClick.mp3", arc.audio.Sound.class).loaded = a -> buttonClick = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/click.ogg" : "sounds/click.mp3", arc.audio.Sound.class).loaded = a -> click = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/conveyor.ogg" : "sounds/conveyor.mp3", arc.audio.Sound.class).loaded = a -> conveyor = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/corexplode.ogg" : "sounds/corexplode.mp3", arc.audio.Sound.class).loaded = a -> corexplode = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/door.ogg" : "sounds/door.mp3", arc.audio.Sound.class).loaded = a -> door = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/drill.ogg" : "sounds/drill.mp3", arc.audio.Sound.class).loaded = a -> drill = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/empty.ogg" : "sounds/empty.mp3", arc.audio.Sound.class).loaded = a -> empty = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/explosion.ogg" : "sounds/explosion.mp3", arc.audio.Sound.class).loaded = a -> explosion = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/explosionbig.ogg" : "sounds/explosionbig.mp3", arc.audio.Sound.class).loaded = a -> explosionbig = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/fire.ogg" : "sounds/fire.mp3", arc.audio.Sound.class).loaded = a -> fire = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/flame.ogg" : "sounds/flame.mp3", arc.audio.Sound.class).loaded = a -> flame = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/flame2.ogg" : "sounds/flame2.mp3", arc.audio.Sound.class).loaded = a -> flame2 = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/laser.ogg" : "sounds/laser.mp3", arc.audio.Sound.class).loaded = a -> laser = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/laserbig.ogg" : "sounds/laserbig.mp3", arc.audio.Sound.class).loaded = a -> laserbig = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/machine.ogg" : "sounds/machine.mp3", arc.audio.Sound.class).loaded = a -> machine = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/message.ogg" : "sounds/message.mp3", arc.audio.Sound.class).loaded = a -> message = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/missile.ogg" : "sounds/missile.mp3", arc.audio.Sound.class).loaded = a -> missile = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/pew.ogg" : "sounds/pew.mp3", arc.audio.Sound.class).loaded = a -> pew = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/place.ogg" : "sounds/place.mp3", arc.audio.Sound.class).loaded = a -> place = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/press.ogg" : "sounds/press.mp3", arc.audio.Sound.class).loaded = a -> press = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/release.ogg" : "sounds/release.mp3", arc.audio.Sound.class).loaded = a -> release = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/respawn.ogg" : "sounds/respawn.mp3", arc.audio.Sound.class).loaded = a -> respawn = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/respawning.ogg" : "sounds/respawning.mp3", arc.audio.Sound.class).loaded = a -> respawning = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/shoot.ogg" : "sounds/shoot.mp3", arc.audio.Sound.class).loaded = a -> shoot = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/shootBig.ogg" : "sounds/shootBig.mp3", arc.audio.Sound.class).loaded = a -> shootBig = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/shootSnap.ogg" : "sounds/shootSnap.mp3", arc.audio.Sound.class).loaded = a -> shootSnap = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/shotgun.ogg" : "sounds/shotgun.mp3", arc.audio.Sound.class).loaded = a -> shotgun = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/spark.ogg" : "sounds/spark.mp3", arc.audio.Sound.class).loaded = a -> spark = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/splash.ogg" : "sounds/splash.mp3", arc.audio.Sound.class).loaded = a -> splash = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/spray.ogg" : "sounds/spray.mp3", arc.audio.Sound.class).loaded = a -> spray = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/thruster.ogg" : "sounds/thruster.mp3", arc.audio.Sound.class).loaded = a -> thruster = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/unlock.ogg" : "sounds/unlock.mp3", arc.audio.Sound.class).loaded = a -> unlock = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/wave.ogg" : "sounds/wave.mp3", arc.audio.Sound.class).loaded = a -> wave = (arc.audio.Sound)a;
    arc.Core.assets.load(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/windowHide.ogg" : "sounds/windowHide.mp3", arc.audio.Sound.class).loaded = a -> windowHide = (arc.audio.Sound)a;
  }

  public static void dispose() {
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/artillery.ogg" : "sounds/artillery.mp3");
    artillery = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/back.ogg" : "sounds/back.mp3");
    back = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/bang.ogg" : "sounds/bang.mp3");
    bang = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/beam.ogg" : "sounds/beam.mp3");
    beam = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/bigshot.ogg" : "sounds/bigshot.mp3");
    bigshot = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/boom.ogg" : "sounds/boom.mp3");
    boom = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/break.ogg" : "sounds/break.mp3");
    breaks = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/build.ogg" : "sounds/build.mp3");
    build = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/buttonClick.ogg" : "sounds/buttonClick.mp3");
    buttonClick = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/click.ogg" : "sounds/click.mp3");
    click = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/conveyor.ogg" : "sounds/conveyor.mp3");
    conveyor = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/corexplode.ogg" : "sounds/corexplode.mp3");
    corexplode = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/door.ogg" : "sounds/door.mp3");
    door = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/drill.ogg" : "sounds/drill.mp3");
    drill = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/empty.ogg" : "sounds/empty.mp3");
    empty = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/explosion.ogg" : "sounds/explosion.mp3");
    explosion = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/explosionbig.ogg" : "sounds/explosionbig.mp3");
    explosionbig = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/fire.ogg" : "sounds/fire.mp3");
    fire = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/flame.ogg" : "sounds/flame.mp3");
    flame = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/flame2.ogg" : "sounds/flame2.mp3");
    flame2 = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/laser.ogg" : "sounds/laser.mp3");
    laser = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/laserbig.ogg" : "sounds/laserbig.mp3");
    laserbig = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/machine.ogg" : "sounds/machine.mp3");
    machine = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/message.ogg" : "sounds/message.mp3");
    message = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/missile.ogg" : "sounds/missile.mp3");
    missile = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/pew.ogg" : "sounds/pew.mp3");
    pew = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/place.ogg" : "sounds/place.mp3");
    place = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/press.ogg" : "sounds/press.mp3");
    press = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/release.ogg" : "sounds/release.mp3");
    release = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/respawn.ogg" : "sounds/respawn.mp3");
    respawn = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/respawning.ogg" : "sounds/respawning.mp3");
    respawning = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/shoot.ogg" : "sounds/shoot.mp3");
    shoot = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/shootBig.ogg" : "sounds/shootBig.mp3");
    shootBig = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/shootSnap.ogg" : "sounds/shootSnap.mp3");
    shootSnap = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/shotgun.ogg" : "sounds/shotgun.mp3");
    shotgun = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/spark.ogg" : "sounds/spark.mp3");
    spark = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/splash.ogg" : "sounds/splash.mp3");
    splash = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/spray.ogg" : "sounds/spray.mp3");
    spray = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/thruster.ogg" : "sounds/thruster.mp3");
    thruster = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/unlock.ogg" : "sounds/unlock.mp3");
    unlock = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/wave.ogg" : "sounds/wave.mp3");
    wave = null;
    arc.Core.assets.unload(arc.Core.app.getType() != arc.Application.ApplicationType.iOS ? "sounds/windowHide.ogg" : "sounds/windowHide.mp3");
    windowHide = null;
  }
}
