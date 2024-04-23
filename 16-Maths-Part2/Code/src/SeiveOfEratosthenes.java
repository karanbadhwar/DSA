public class SeiveOfEratosthenes  {
    public static void main(String[] args) {

        // Time Complexity is O(N*log(log N))
        int n = 40;
        boolean[] primes = new boolean[n+1];
        sieve(n,primes);
    }

    static void sieve(int n, boolean[] primes)
    {
        for (int i = 2; i*i <= n ; i++) {
            if(!primes[i])
            {
                for (int multiple = i*2; multiple <= n ; multiple+=i) {
                    primes[multiple] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(!primes[i])
            {
                System.out.println(i + " ");
            }
        }
    }
}
