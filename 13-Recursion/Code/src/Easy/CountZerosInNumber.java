public class CountZerosInNumber {
    public static void main(String[] args) {
        int number = 102030340;
        System.out.println(count(number));
    }

    static int count(int n)
    {
        return helper (n, 0);
    }

    private static int helper(int n, int c) {
        if(n == 0)
        {
            return c;
        }
        return helper(n/10, n%10==0? ++c : c);
    }
}
