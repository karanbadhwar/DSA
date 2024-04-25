public class LCM {
    public static void main(String[] args) {
        /*
        LCM = a*b/ HFC(a,b)

        NOTE: - HCF * LCM = a * b always
         */
        System.out.println(lcm(9,18));
    }

    static int lcm(int a, int b)
    {
        return a*b/gcd(a,b);
    }

    static int gcd(int a, int b)
    {
        if(a == 0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
}
