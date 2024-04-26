public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sumDigits(1342);
        System.out.println(ans);
    }

    //O(logN) - Time Complexity with Base 10
    static int sumDigits(int n)
    {
        if(n == 0)
        {
            return 0;
        }

        return (n%10) + sumDigits(n/10);
    }
}
