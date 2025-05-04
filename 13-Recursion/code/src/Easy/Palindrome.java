public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(1101));
    }

    static boolean palindrome(int n)
    {
        return (n == reverseRecur1(n));
    }

    static int reverseRecur1(int n)
    {
        int digits = (int)Math.log10(n)+1; // log(n)Base10
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        //Base condition
        if(n % 10 == n)
        {
            return n;
        }

        int ans =  (n%10) * (int)Math.pow(10,digits-1) + helper(n/10, digits -1);
        return ans;
    }
}
