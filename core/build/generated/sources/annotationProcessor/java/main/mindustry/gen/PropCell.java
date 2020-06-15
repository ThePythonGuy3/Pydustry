package mindustry.gen;

/**
 * Bits used: 32 / 32
 * <br>  x [0..8]
 * <br>  y [8..16]
 * <br>  damage [16..32]
 */
public final class PropCell {
  public static byte x(int propcell) {
    return (byte)((propcell >>> 0) & 0b00000000000000000000000011111111L);
  }

  public static int x(int propcell, byte value) {
    return (int)((propcell & 0b00000000000000000000000011111111L) | ((int)value << 0L));
  }

  public static byte y(int propcell) {
    return (byte)((propcell >>> 8) & 0b00000000000000000000000011111111L);
  }

  public static int y(int propcell, byte value) {
    return (int)((propcell & 0b00000000000000001111111100000000L) | ((int)value << 8L));
  }

  public static short damage(int propcell) {
    return (short)((propcell >>> 16) & 0b00000000000000001111111111111111L);
  }

  public static int damage(int propcell, short value) {
    return (int)((propcell & 0b11111111111111110000000000000000L) | ((int)value << 16L));
  }

  public static int get(byte x, byte y, short damage) {
    return (int)((((int)x << 0L) & 0b00000000000000000000000011111111L) | (((int)y << 8L) & 0b00000000000000001111111100000000L) | (((int)damage << 16L) & 0b11111111111111110000000000000000L));
  }
}
