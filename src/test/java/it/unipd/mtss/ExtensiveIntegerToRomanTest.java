////////////////////////////////////////////////////////////////////
// Loris Libralato 2068237
// Leonardo Lucato 2075528
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ExtensiveIntegerToRomanTest {

    private String expectedOutput = null;
    private int input;

    public ExtensiveIntegerToRomanTest(String input, String expectedOutput) {
        this.expectedOutput = expectedOutput;
        this.input = Integer.parseInt(input);
    }

    @Parameters
    public static Collection<String[]> testProvider() {
        String[][] tests = {
                { "1", "I" },
                { "2", "II" },
                { "3", "III" },
                { "4", "IV" },
                { "5", "V" },
                { "6", "VI" },
                { "9", "IX" },
                { "10", "X" },
                { "17", "XVII" },
                { "20", "XX" },
                { "35", "XXXV" },
                { "45","XLV" },
                { "49","XLIX" },
                { "50","L" },
                { "60","LX" },
                { "75","LXXV" },
                { "88","LXXXVIII" },
                { "94","XCIV" },
                { "97","XCVII" },
                { "99","XCIX" },
                { "100","C" },
                { "178","CLXXVIII" },
                { "200","CC" },
                { "248","CCXLVIII" },
                { "444","CDXLIV"},
                { "471","CDLXXI"},
                { "499","CDXCIX"},
                { "500","D" },
        };
        return Arrays.asList(tests);
    }

    @Test
    public void testConvertFromArabicToRoman() {
        int arabic_number = input;
        String roman_number = IntegerToRoman.convert(arabic_number);

        assertEquals(expectedOutput, roman_number);
    }
}
