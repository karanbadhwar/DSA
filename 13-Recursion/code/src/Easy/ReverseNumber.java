public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseRecur1(1342));
    }

    //Reverse a Number Using another Variable outside the Scope
    static int sum = 0;

    static void reverseRecur(int n)
    {
        if(n == 0) // Base condition
        {
            return;
        }

        int rem = n % 10; // Remainder Part
        sum = sum * 10 + rem; // Reversing Technique by using another Variable
        reverseRecur(n/10); //Recursion Call

    }

    //Reverse a number without taking another Extra Variable
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
