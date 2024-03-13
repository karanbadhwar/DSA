import java.util.Arrays;

public class ChangeValueExample {
    public static void main(String[] args) {
        // Pass by value of the reference variable !!!

        int[] arr = {1,3,5,7,9,13};

//        int[] a,b,c[];
        change(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums)
    {
        nums[0] = 99;
    }
}
