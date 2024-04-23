public class PrimeNumber {
    public static void main(String[] args) {

    }
    static boolean isPrime(int n)
    {
        if(n <= 1)
        {
            return false;
        }

        int start = 2;

        while(start * start <= n)
        {
            if(n % start == 0)
            {
                return false;
            }
            start++;
        }
        return true;
    }
}
