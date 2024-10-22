import java.math.BigInteger;

public class Factorial {
    static BigInteger fact(int num) {
        BigInteger answer = new BigInteger("1");

        for (int i = 2; i <= num; i++) {
            answer =  answer.multiply(BigInteger.valueOf(i));
        }

        return answer;
    }
}
