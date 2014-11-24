package com.github.lgvo.bits.helper;

public final class LongBits {

    private LongBits() {}

    public static long hexCharToLong(final char h) {
        return IntBits.hexCharToInt(h);
    }

    public static long fromHexSubstring(final String hex, final int init, final int end) {
        long value = 0;
        for (int x = init; x < end; x++) {
            value = value << 4;
            value += hexCharToLong(hex.charAt(x));
        }
        return value;
    }

    public static long fromByteArrayRange(final byte[] arr, final int init, final int end) {
        long value = 0;
        for (int x = init; x < end; x++) {
            value = value << 8;
            value += (int) arr[x] & 0xff;
        }
        return value;
    }

}
