////////////////////////////////////////////////////////////////////
// Loris Libralato 2068237
// Leonardo Lucato 2075528
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    public record Pair(Integer value, String symbol) {
    }

    private static final Pair[] VALUES = {
            new Pair(1, "I"),
    };

    public static String convert(int number) {
        StringBuilder output = new StringBuilder();
        int rem = number;

        for (int i = 0; i < VALUES.length; i++) {
            while (rem >= VALUES[i].value) {
                rem -= VALUES[i].value;
                output.append(VALUES[i].symbol);
            }
        }

        return output.toString();
    }
}