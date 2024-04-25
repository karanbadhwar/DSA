public class SumOfN {
    public static void main(String[] args) {
        int ans = SumRecur(5);
        System.out.println(ans);
    }
    static int SumRecur(int n)
    {
        if(n == 1)
        {
            return 1;
        }

        return n + SumRecur(n-1);
    }
}
