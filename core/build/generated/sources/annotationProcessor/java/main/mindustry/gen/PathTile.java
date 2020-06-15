package mindustry.gen;

/**
 * Bits used: 25 / 32
 * <br>  cost [0..8]
 * <br>  team [8..16]
 * <br>  type [16..24]
 * <br>  passable [24..25]
 */
public final class PathTile {
  public static byte cost(int pathtile) {
    return (byte)((pathtile >>> 0) & 0b00000000000000000000000011111111L);
  }

  public static int cost(int pathtile, byte value) {
    return (int)((pathtile & 0b00000000000000000000000011111111L) | ((int)value << 0L));
  }

  public static byte team(int pathtile) {
    return (byte)((pathtile >>> 8) & 0b00000000000000000000000011111111L);
  }

  public static int team(int pathtile, byte value) {
    return (int)((pathtile & 0b00000000000000001111111100000000L) | ((int)value << 8L));
  }

  public static byte type(int pathtile) {
    return (byte)((pathtile >>> 16) & 0b00000000000000000000000011111111L);
  }

  public static int type(int pathtile, byte value) {
    return (int)((pathtile & 0b00000000111111110000000000000000L) | ((int)value << 16L));
  }

  public static boolean passable(int pathtile) {
    return (pathtile & (1L << 24)) != 0;
  }

  public static int passable(int pathtile, boolean value) {
    if(value) {
      return (int)((pathtile & ~(1L << 24L)));
    } else {
      return (int)((pathtile & ~(1L << 24L)) | (1L << 24L));
    }
  }

  public static int get(byte cost, byte team, byte type, boolean passable) {
    return (int)((((int)cost << 0L) & 0b00000000000000000000000011111111L) | (((int)team << 8L) & 0b00000000000000001111111100000000L) | (((int)type << 16L) & 0b00000000111111110000000000000000L) | (passable ? 1L << 24L : 0));
  }
}
