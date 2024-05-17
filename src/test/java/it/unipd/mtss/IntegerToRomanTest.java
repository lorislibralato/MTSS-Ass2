////////////////////////////////////////////////////////////////////
// Loris Libralato 2068237
// Leonardo Lucato 2075528
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvert0() {
        int arabic_number = 0;
        String roman_number = IntegerToRoman.convert(arabic_number);

        assertEquals("", roman_number);
    }

    @Test(expected = NegativeNumberException.class)
    public void testConvertNegativeNum() {
        int arabic_number = -6;

        IntegerToRoman.convert(arabic_number);
    }
}