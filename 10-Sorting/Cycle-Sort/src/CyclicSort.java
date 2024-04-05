import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int correctIndex = arr[i] - 1;

            if(i != correctIndex) // if(arr[i] != arr[correctIndex])
            {
                swap(arr, i, correctIndex);
            } else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int presentIndex, int correctIndex)
    {
        int temp = arr[presentIndex];
        arr[presentIndex] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
