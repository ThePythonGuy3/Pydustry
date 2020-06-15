package mindustry.gen;

/**
 * Bits used: 56 / 64
 * <br>  x [0..16]
 * <br>  y [16..32]
 * <br>  type [32..40]
 * <br>  value [40..56]
 */
public final class TileOp {
  public static short x(long tileop) {
    return (short)((tileop >>> 0) & 0b0000000000000000000000000000000000000000000000001111111111111111L);
  }

  public static long x(long tileop, short value) {
    return (long)((tileop & 0b0000000000000000000000000000000000000000000000001111111111111111L) | ((long)value << 0L));
  }

  public static short y(long tileop) {
    return (short)((tileop >>> 16) & 0b0000000000000000000000000000000000000000000000001111111111111111L);
  }

  public static long y(long tileop, short value) {
    return (long)((tileop & 0b0000000000000000000000000000000011111111111111110000000000000000L) | ((long)value << 16L));
  }

  public static byte type(long tileop) {
    return (byte)((tileop >>> 32) & 0b0000000000000000000000000000000000000000000000000000000011111111L);
  }

  public static long type(long tileop, byte value) {
    return (long)((tileop & 0b0000000000000000000000001111111100000000000000000000000000000000L) | ((long)value << 32L));
  }

  public static short value(long tileop) {
    return (short)((tileop >>> 40) & 0b0000000000000000000000000000000000000000000000001111111111111111L);
  }

  public static long value(long tileop, short value) {
    return (long)((tileop & 0b0000000011111111111111110000000000000000000000000000000000000000L) | ((long)value << 40L));
  }

  public static long get(short x, short y, byte type, short value) {
    return (long)((((long)x << 0L) & 0b0000000000000000000000000000000000000000000000001111111111111111L) | (((long)y << 16L) & 0b0000000000000000000000000000000011111111111111110000000000000000L) | (((long)type << 32L) & 0b0000000000000000000000001111111100000000000000000000000000000000L) | (((long)value << 40L) & 0b0000000011111111111111110000000000000000000000000000000000000000L));
  }
}
