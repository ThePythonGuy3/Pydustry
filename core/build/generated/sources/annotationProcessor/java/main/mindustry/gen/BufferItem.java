package mindustry.gen;

/**
 * Bits used: 40 / 64
 * <br>  item [0..8]
 * <br>  time [8..40]
 */
public final class BufferItem {
  public static byte item(long bufferitem) {
    return (byte)((bufferitem >>> 0) & 0b0000000000000000000000000000000000000000000000000000000011111111L);
  }

  public static long item(long bufferitem, byte value) {
    return (long)((bufferitem & 0b0000000000000000000000000000000000000000000000000000000011111111L) | ((long)value << 0L));
  }

  public static float time(long bufferitem) {
    return Float.intBitsToFloat((int)((bufferitem >>> 8) & 0b0000000000000000000000000000000011111111111111111111111111111111L));
  }

  public static long time(long bufferitem, float value) {
    return (long)((bufferitem & 0b0000000000000000000000001111111111111111111111111111111100000000L) | ((long)Float.floatToIntBits(value) << 8L));
  }

  public static long get(byte item, float time) {
    return (long)((((long)item << 0L) & 0b0000000000000000000000000000000000000000000000000000000011111111L) | ((long)Float.floatToIntBits(time) << 8L));
  }
}
