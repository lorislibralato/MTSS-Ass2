////////////////////////////////////////////////////////////////////
// Loris Libralato 2068237
// Leonardo Lucato 2075528
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {

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

    @Test
    public void testPrint9() {
        int number = 9;
        String expected = """
                 _____  __   __\s
                |_   _| \\ \\ / /\s
                  | |    \\ V / \s
                  | |     > <  \s
                 _| |_   / . \\ \s
                |_____| /_/ \\_\\\s
                    """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint10() {
        int number = 10;
        String expected = """
                __   __\s
                \\ \\ / /\s
                 \\ V / \s
                  > <  \s
                 / . \\ \s
                /_/ \\_\\\s
                        """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint17() {
        int number = 17;
        String expected = """
                __   __ __      __  _____   _____ \s
                \\ \\ / / \\ \\    / / |_   _| |_   _|\s
                 \\ V /   \\ \\  / /    | |     | |  \s
                  > <     \\ \\/ /     | |     | |  \s
                 / . \\     \\  /     _| |_   _| |_ \s
                /_/ \\_\\     \\/     |_____| |_____|\s
                        """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint20() {
        int number = 20;
        String expected = """
                __   __ __   __\s
                \\ \\ / / \\ \\ / /\s
                 \\ V /   \\ V / \s
                  > <     > <  \s
                 / . \\   / . \\ \s
                /_/ \\_\\ /_/ \\_\\\s
                        """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint45() {
        int number = 45;
        String expected = """
                __   __  _       __      __\s
                \\ \\ / / | |      \\ \\    / /\s
                 \\ V /  | |       \\ \\  / / \s
                  > <   | |        \\ \\/ /  \s
                 / . \\  | |____     \\  /   \s
                /_/ \\_\\ |______|     \\/    \s
                        """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint49() {
        int number = 49;
        String expected = """
                __   __  _        _____  __   __\s
                \\ \\ / / | |      |_   _| \\ \\ / /\s
                 \\ V /  | |        | |    \\ V / \s
                  > <   | |        | |     > <  \s
                 / . \\  | |____   _| |_   / . \\ \s
                /_/ \\_\\ |______| |_____| /_/ \\_\\\s
                        """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint50() {
        int number = 50;
        String expected = """
                 _      \s
                | |     \s
                | |     \s
                | |     \s
                | |____ \s
                |______|\s
                        """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint94() {
        int number = 94;
        String expected = """
                __   __   _____   _____  __      __\s
                \\ \\ / /  / ____| |_   _| \\ \\    / /\s
                 \\ V /  | |        | |    \\ \\  / / \s
                  > <   | |        | |     \\ \\/ /  \s
                 / . \\  | |____   _| |_     \\  /   \s
                /_/ \\_\\  \\_____| |_____|     \\/    \s
                                """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint97() {
        int number = 97;
        String expected = """
                __   __   _____  __      __  _____   _____ \s
                \\ \\ / /  / ____| \\ \\    / / |_   _| |_   _|\s
                 \\ V /  | |       \\ \\  / /    | |     | |  \s
                  > <   | |        \\ \\/ /     | |     | |  \s
                 / . \\  | |____     \\  /     _| |_   _| |_ \s
                /_/ \\_\\  \\_____|     \\/     |_____| |_____|\s
                                """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint100() {
        int number = 100;
        String expected = """
                  _____ \s
                 / ____|\s
                | |     \s
                | |     \s
                | |____ \s
                 \\_____|\s
                            """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint248() {
        int number = 248;
        String expected = """
                  _____    _____  __   __  _       __      __  _____   _____   _____ \s
                 / ____|  / ____| \\ \\ / / | |      \\ \\    / / |_   _| |_   _| |_   _|\s
                | |      | |       \\ V /  | |       \\ \\  / /    | |     | |     | |  \s
                | |      | |        > <   | |        \\ \\/ /     | |     | |     | |  \s
                | |____  | |____   / . \\  | |____     \\  /     _| |_   _| |_   _| |_ \s
                 \\_____|  \\_____| /_/ \\_\\ |______|     \\/     |_____| |_____| |_____|\s
                                      """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint444() {
        int number = 444;
        String expected = """
                  _____   _____   __   __  _        _____  __      __\s
                 / ____| |  __ \\  \\ \\ / / | |      |_   _| \\ \\    / /\s
                | |      | |  | |  \\ V /  | |        | |    \\ \\  / / \s
                | |      | |  | |   > <   | |        | |     \\ \\/ /  \s
                | |____  | |__| |  / . \\  | |____   _| |_     \\  /   \s
                 \\_____| |_____/  /_/ \\_\\ |______| |_____|     \\/    \s
                                      """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint499() {
        int number = 499;
        String expected = """
                  _____   _____   __   __   _____   _____  __   __\s
                 / ____| |  __ \\  \\ \\ / /  / ____| |_   _| \\ \\ / /\s
                | |      | |  | |  \\ V /  | |        | |    \\ V / \s
                | |      | |  | |   > <   | |        | |     > <  \s
                | |____  | |__| |  / . \\  | |____   _| |_   / . \\ \s
                 \\_____| |_____/  /_/ \\_\\  \\_____| |_____| /_/ \\_\\\s
                                      """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint500() {
        int number = 500;
        String expected = """
                 _____  \s
                |  __ \\ \s
                | |  | |\s
                | |  | |\s
                | |__| |\s
                |_____/ \s
                        """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint617() {
        int number = 617;
        String expected = """
                 _____     _____  __   __ __      __  _____   _____ \s
                |  __ \\   / ____| \\ \\ / / \\ \\    / / |_   _| |_   _|\s
                | |  | | | |       \\ V /   \\ \\  / /    | |     | |  \s
                | |  | | | |        > <     \\ \\/ /     | |     | |  \s
                | |__| | | |____   / . \\     \\  /     _| |_   _| |_ \s
                |_____/   \\_____| /_/ \\_\\     \\/     |_____| |_____|\s
                                         """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint981() {
        int number = 981;
        String expected = """
                  _____   __  __   _       __   __ __   __ __   __  _____ \s
                 / ____| |  \\/  | | |      \\ \\ / / \\ \\ / / \\ \\ / / |_   _|\s
                | |      | \\  / | | |       \\ V /   \\ V /   \\ V /    | |  \s
                | |      | |\\/| | | |        > <     > <     > <     | |  \s
                | |____  | |  | | | |____   / . \\   / . \\   / . \\   _| |_ \s
                 \\_____| |_|  |_| |______| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\ |_____|\s
                                      """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint999() {
        int number = 999;
        String expected = """
                  _____   __  __  __   __   _____   _____  __   __\s
                 / ____| |  \\/  | \\ \\ / /  / ____| |_   _| \\ \\ / /\s
                | |      | \\  / |  \\ V /  | |        | |    \\ V / \s
                | |      | |\\/| |   > <   | |        | |     > <  \s
                | |____  | |  | |  / . \\  | |____   _| |_   / . \\ \s
                 \\_____| |_|  |_| /_/ \\_\\  \\_____| |_____| /_/ \\_\\\s
                                                   """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }

    @Test
    public void testPrint1000() {
        int number = 1000;
        String expected = """
                 __  __ \s
                |  \\/  |\s
                | \\  / |\s
                | |\\/| |\s
                | |  | |\s
                |_|  |_|\s
                         """;

        String output = RomanPrinter.print(number);

        assertEquals(expected, output);
    }
}
