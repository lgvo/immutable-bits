package com.github.lgvo.bits.helper;

public class IntBits {

    public static int hexCharToInt(final char h) {
        if (h >= '0' && h <= '9') {
            return h - '0';
        } else if (h >= 'a' && h <= 'f') {
            return h - 'a' + 10;
        }
        throw new IllegalArgumentException("Invalid hex character: " + h);
    }

}
