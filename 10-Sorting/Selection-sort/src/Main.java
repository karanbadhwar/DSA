import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Selection Sort
        //Best & Worst is same O(N^2)
        //Works best for small Lists

//        int[] arr = {-32,-1,12,23,1,2,0};
        int[] arr = {1,2,3,4,5};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0, lastIndex);
            if(maxIndex != lastIndex)
            {
                swap(arr, maxIndex, lastIndex);
            }

        }

    }

    static void swap(int[] arr, int maxIndex, int lastIndex)
    {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }


    static int getMaxIndex(int[] arr, int start, int end)
    {
        int max = start;

        for (int i = start; i < end; i++) {
            if(arr[max] < arr[i + 1])
            {
                max = i + 1;

            }
        }
        return max;
    }
}