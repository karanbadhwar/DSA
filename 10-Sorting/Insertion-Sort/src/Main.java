import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Insertion Sort
        //WorstCase O(N^2)
        //Best case O(N)
        //Works best with smaller values and with Hybrid sorting algo

        int[] arr = {4,5,1,2,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void insertionSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j - 1] > arr[j])
                {
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int maxIndex, int lastIndex)
    {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
    }
}