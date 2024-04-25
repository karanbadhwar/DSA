public class EuclideanAlgo {
    public static void main(String[] args) {
        /*
            GCD(a,b) = GCD(remainder(b,a)(Modulo), a);
         */
        System.out.println(gcd(105,224));
    }

    static int gcd(int a, int b)
    {

        if(a == 0)
        {
            return b;
        }

        return gcd(b%a, a);
    }
}
