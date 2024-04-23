public class PrimeNumber {
    public static void main(String[] args) {
        int n = 20;
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " " + isPrime(i));
        }
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
