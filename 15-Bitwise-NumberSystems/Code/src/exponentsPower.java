public class exponentsPower {
    public static void main(String[] args) {

        //Complexity of O(log(power))
        int base = 3;
        int power = 6;

        int ans = 1;

        while(power > 0)
        {
            int last = power & 1;
            if(last == 1)
            {
                ans = ans * base;
            }
            base *= base;
            power = power >> 1;
        }

        System.out.println(ans);
    }
}
