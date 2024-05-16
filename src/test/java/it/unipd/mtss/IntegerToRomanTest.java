////////////////////////////////////////////////////////////////////
// Loris Libralato 2068237
// Leonardo Lucato 2075528
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testPrint1() {
        int number = 1;
        String expected = """
                 _____ \s
                |_   _|\s
                  | |  \s
                  | |  \s
                 _| |_ \s
                |_____|\s
                """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint3() {
        int number = 3;
        String expected = """
                 _____   _____   _____ \s
                |_   _| |_   _| |_   _|\s
                  | |     | |     | |  \s
                  | |     | |     | |  \s
                 _| |_   _| |_   _| |_ \s
                |_____| |_____| |_____|\s
                """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint4() {
        int number = 4;
        String expected = """
                 _____  __      __\s
                |_   _| \\ \\    / /\s
                  | |    \\ \\  / / \s
                  | |     \\ \\/ /  \s
                 _| |_     \\  /   \s
                |_____|     \\/    \s
                """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint6() {
        int number = 6;
        String expected = """
                __      __  _____ \s
                \\ \\    / / |_   _|\s
                 \\ \\  / /    | |  \s
                  \\ \\/ /     | |  \s
                   \\  /     _| |_ \s
                    \\/     |_____|\s
                    """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }
}
