package com.github.lgvo.bits;

import com.github.lgvo.bits.helper.LongBits;

import java.util.Objects;

public class Immutable128Bits {

    private final long part1;
    private final long part2;

    public Immutable128Bits(final String hex) {
        Objects.requireNonNull(hex);
        final int length = hex.length();
        if (length > 32) {
            throw new IllegalArgumentException("Size of hex string cant be greater than 32. size=" + hex.length());
        }

        part1 = LongBits.fromHexSubstring(hex, 0, Math.min(16, length));
        part2 = length > 16 ? LongBits.fromHexSubstring(hex, 16, length) : 0;
    }

    protected long getPart1() {
        return part1;
    }

    protected long getPart2() {
        return part2;
    }

    @Override
    public String toString() {
        return String.format("%016x%016x", part1, part2);
    }
}
