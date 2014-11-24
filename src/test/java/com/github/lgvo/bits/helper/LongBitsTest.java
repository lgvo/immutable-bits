package com.github.lgvo.bits.helper;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.github.lgvo.bits.helper.LongBits.*;

public class LongBitsTest {

    @Test
    public void testHexCharToLong() throws Exception {
        assertEquals(0l, hexCharToLong('0'));
        assertEquals(1l, hexCharToLong('1'));
        assertEquals(2l, hexCharToLong('2'));
        assertEquals(3l, hexCharToLong('3'));
        assertEquals(4l, hexCharToLong('4'));
        assertEquals(5l, hexCharToLong('5'));
        assertEquals(6l, hexCharToLong('6'));
        assertEquals(7l, hexCharToLong('7'));
        assertEquals(8l, hexCharToLong('8'));
        assertEquals(9l, hexCharToLong('9'));
        assertEquals(10l, hexCharToLong('a'));
        assertEquals(11l, hexCharToLong('b'));
        assertEquals(12l, hexCharToLong('c'));
        assertEquals(13l, hexCharToLong('d'));
        assertEquals(14l, hexCharToLong('e'));
        assertEquals(15l, hexCharToLong('f'));
    }

    @Test
    public void testFromHexSubstring() throws Exception {
        assertEquals(0xffffffffffffffffL, fromHexSubstring("ffffffffffffffff", 0, 16));
    }

    @Test
    public void testFromByteArrayRange() throws Exception {
        assertEquals(0xffffffffffffffffL, fromByteArrayRange(new byte[] {
                (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff,
                (byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff,
        }, 0, 8));
    }
}