public class NoOfSetBits {
    public static void main(String[] args) {
        int num = 45;

        System.out.println(Integer.toBinaryString(num));

        System.out.println(setBits(num));

    }

    private static int setBits(int num) {
        int count = 0;

        while(num > 0)
        {
            count++;

            num &= (num -1);

//            num -= (num & -num); // removing the right most set bit
        }
        return count;
    }
}
