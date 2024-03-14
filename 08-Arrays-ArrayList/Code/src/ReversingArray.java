import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18,2};

        System.out.println(Arrays.toString(arr));

        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        for (; start < end ; start++) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
        }


    }
}
