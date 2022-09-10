package automap;

public class MapColor {
    /**
     * Configurable colors - now an enum
     *  - Good Sign 2017/04/05
     *
     * Use colormap-specific colors to support extended modes.
     * Moved hardcoding in here. Potentially configurable.
     */
    public enum Color {
        CLOSE_TO_BLACK(1, (byte) 246),
        REDS(16, (byte) 176 /*(256 - 5 * 16)*/),
        BLUES(8, (byte) 200 /*(256 - 4 * 16 + 8)*/),
        GREENS(16, (byte) 112 /*(7 * 16)*/),
        GRAYS(16, (byte) 96 /*(6 * 16)*/),
        BROWNS(16, (byte) 64 /*(4 * 16)*/),
        YELLOWS(8, (byte) 160 /*(256 - 32)*/),
        BLACK(1, (byte) 0),
        WHITE(1, (byte) 4),
        GRAYS_DARKER_25(13, (byte)(GRAYS.value + 4)),
        DARK_GREYS(8, (byte)(GRAYS.value + GRAYS.range / 2)),
        DARK_REDS(8, (byte)(REDS.value + REDS.range / 2));

        final static int NUM_LITES = 8;
        final static int[] LITE_LEVELS_FULL_RANGE = { 0, 4, 7, 10, 12, 14, 15, 15 };
        final static int[] LITE_LEVELS_HALF_RANGE = { 0, 2, 3, 5, 6, 6, 7, 7 };
        final byte[] liteBlock;
        final byte value;
        final int range;

        Color(int range, byte value) {
            this.range = range;
            this.value = value;
            if (range >= NUM_LITES) {
                this.liteBlock = new byte[NUM_LITES];
            } else {
                this.liteBlock = null;
            }
        }

        static {
            for (Color c: values()) {
                switch(c.range) {
                    case 16:
                        for (int i = 0; i < NUM_LITES; ++i) {
                            c.liteBlock[i] = (byte) (c.value + LITE_LEVELS_FULL_RANGE[i]);
                        }
                        break;
                    case 8:
                        for (int i = 0; i < LITE_LEVELS_HALF_RANGE.length; ++i) {
                            c.liteBlock[i] = (byte) (c.value + LITE_LEVELS_HALF_RANGE[i]);
                        }
                }
            }
        }
    }
}
