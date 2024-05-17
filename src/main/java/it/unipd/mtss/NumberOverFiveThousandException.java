////////////////////////////////////////////////////////////////////
// Loris Libralato 2068237
// Leonardo Lucato 2075528
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class NumberOverFiveThousandException extends RuntimeException {
    public NumberOverFiveThousandException() {
        super("Non è possibile convertire un numero maggiore o uguale di 5000");
    }
}
