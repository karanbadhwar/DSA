import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        //BigInteger -> Extends Number and Comparable<BigInteger>
        // BigInteger -> Range from -2^Integer.MAX_VALUE - 2^Integer.MAX_VALUE  (both EXCLUSIVE)

        int a = 30;
        int b = 67;

        BigInteger B = BigInteger.valueOf(6); // convert int/long to BI
        int c = B.intValue(); // convert BI to int
        BigInteger C = new BigInteger("2345678654325678976543256789");
        BigInteger X = new BigInteger("4536789765432");

        // constants
        BigInteger D = BigInteger.TEN;

        // operations
        BigInteger s = C.add(X);

        BigInteger m = C.multiply(X);

        BigInteger sub = C.subtract(X);

        BigInteger d = C.divide(X);

        BigInteger rem = C.remainder(X);

        if (X.compareTo(C) < 0) {
            System.out.println("Yes");
        }

        System.out.println(Factorial.fact(50));

    }
}