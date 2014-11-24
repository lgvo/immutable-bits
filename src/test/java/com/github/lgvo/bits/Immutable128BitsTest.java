package com.github.lgvo.bits;

import org.junit.Test;

import static org.junit.Assert.*;

public class Immutable128BitsTest {

    @Test
    public void testCreateFromHex() {
        final String hex = "03ff1e39a037d920f1243ee99b57da1b";
        assertEquals(128 /4, hex.length());

        final Immutable128Bits immutable128Bits = new Immutable128Bits(hex);


        assertEquals(hex, immutable128Bits.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidHexDigit() {
        final String hex = "0439208f91939d90300a09r0fpadfb94";
        new Immutable128Bits(hex);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidHexSize() {
        final String hex = "03ff1e39a037d920f1243ee99b57da1baa";
        new Immutable128Bits(hex);
    }

    @Test
    public void testGetParts() {
        final String hex = "03ff1e39a037d920f1243ee99b57da1b";
        final Immutable128Bits immutable = new Immutable128Bits(hex);
        assertEquals(hex.substring(0,16), String.format("%016x",immutable.getPart1()));
        assertEquals(hex.substring(16), String.format("%016x",immutable.getPart2()));
    }

}