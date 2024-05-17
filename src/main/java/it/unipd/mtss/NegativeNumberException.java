////////////////////////////////////////////////////////////////////
// Loris Libralato 2068237
// Leonardo Lucato 2075528
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class NegativeNumberException extends RuntimeException {
    public NegativeNumberException() {
        super("Non è possibile convertire un numero negativo");
    }
}