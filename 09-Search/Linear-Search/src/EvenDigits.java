public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {18,124,9,1764,98,1,4444};

        System.out.println(findNumbers(nums));

        System.out.println(digits(-54637));
        System.out.println(digits(0));
        System.out.println(optimizedDigits(456747));
    }

    static int findNumbers(int[] nums)
    {
        int count = 0;

        for(int num: nums)
        {
            if(even(num))
            {
                count++;
            }
        }

        return count;
    }

    //Function to check, whether a number contains even digit or not
    static boolean even(int num) {
        int numOfDigits = digits(num);

        return numOfDigits % 2 == 0;
    }

    //Count number of digits in a number
    static int digits(int num)
    {

        if (num < 0)
        {
            num = num * -1;
        }

        if (num == 0)
        {
            return 1;
        }
        int count = 0;
        while(num > 0)
        {
            count++;
            num = num / 10;

        }
        return count;
    }

    //Optimized solution for finding digits
    static int optimizedDigits(int num)
    {
        if (num < 0)
        {
            num = num * -1;
        }

        if (num == 0)
        {
            return 1;
        }

        return (int)(Math.log10(num)) + 1;
    }
}
