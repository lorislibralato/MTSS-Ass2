////////////////////////////////////////////////////////////////////
// Loris Libralato 2068237
// Leonardo Lucato 2075528
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Map;

public class RomanPrinter {

    private static final Map<Character, String[]> ROMAN_MAP = Map.of(
            'I', """
                     _____ \s
                    |_   _|\s
                      | |  \s
                      | |  \s
                     _| |_ \s
                    |_____|\s""".split("\n"),
            'V', """
                    __      __\s
                    \\ \\    / /\s
                     \\ \\  / / \s
                      \\ \\/ /  \s
                       \\  /   \s
                        \\/    \s""".split("\n"),
            'X', """
                    __   __\s
                    \\ \\ / /\s
                     \\ V / \s
                      > <  \s
                     / . \\ \s
                    /_/ \\_\\\s
                        """.split("\n"),
            'L', """
                     _      \s
                    | |     \s
                    | |     \s
                    | |     \s
                    | |____ \s
                    |______|\s
                        """.split("\n"),
            'C', """
                      _____ \s
                     / ____|\s
                    | |     \s
                    | |     \s
                    | |____ \s
                     \\_____|\s
                             """.split("\n"),
            'D', """
                     _____  \s
                    |  __ \\ \s
                    | |  | |\s
                    | |  | |\s
                    | |__| |\s
                    |_____/ \s
                                 """.split("\n"),
            'M', """
                     __  __ \s
                    |  \\/  |\s
                    | \\  / |\s
                    | |\\/| |\s
                    | |  | |\s
                    |_|  |_|\s
                                     """.split("\n"));

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        var builder = new StringBuilder();

        if (romanNumber.isEmpty()) {
            return "";
        }

        for (int j = 0; j < 6; j++) {
            for (int i = 0; i < romanNumber.length(); i++) {
                builder.append(ROMAN_MAP.get(romanNumber.charAt(i))[j]);
            }
            builder.append("\n");
        }

        return builder.toString();
    }
}