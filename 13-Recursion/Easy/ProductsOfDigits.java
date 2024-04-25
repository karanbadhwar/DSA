public class ProductsOfDigits {
    public static void main(String[] args) {
        int ans = productDigits(505);
        System.out.println(ans);
    }
    //O(logN) - Time Complexity with Base 10
    static int productDigits(int n)
    {
        if(n %10 == n)
        {
            return n;
        }

        return (n%10) * productDigits(n/10);
    }
}
