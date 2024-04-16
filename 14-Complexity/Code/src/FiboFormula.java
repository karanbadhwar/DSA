public class FiboFormula {
    public static void main(String[] args) {
        long ans = fiboFormula(50);
        System.out.println(ans);
    }

    static long fiboFormula(int n)
    {
        return (long)(Math.pow((1+ Math.sqrt(5))/2, n) / Math.sqrt(5));
    }

    static int fibo(int n) {
        //Base Condition
        if( n < 2)
            return n;

        return fibo(n - 1) + fibo(n-2);
    }
}
