public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 48;
        // 0 is an Exception case, Fix for n = 0
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);

//        if(n == 0)
//        {
//            ans = false;
//        }
    }
}
