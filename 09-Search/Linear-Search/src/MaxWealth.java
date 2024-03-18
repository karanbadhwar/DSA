public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,5},
                {7,3},
                {3,5}
        };

        System.out.println(maximumWealth(arr));

    }

    static public int maximumWealth(int[][] accounts) {
        int maximum = 0;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int account : ints) {
                sum += account;
            }

            /*
            if(sum > maximum)
            {
                maximum = sum;
            }
             */

            maximum = max(sum, maximum);
        }
        return maximum;
    }

     static int max(int sum, int m) {
        if(m < sum)
        {
            return sum;
        }
        return m;
    }
}
