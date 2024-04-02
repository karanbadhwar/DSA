import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //In Bubble Sort we are comparing Adjacent Elements
        //Bubble Sort == Sinking Sort ==  Exchange Sort
        System.out.println("Bubble Sort");

        int[] arr = {3,1,5,4,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr)
    {
        boolean swapped;
        //Run the length n-1 times
        for (int i = 0; i < arr.length; i++)
        {
            swapped = false;
            //For each step max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) // Condition can be j <= arr.length - i - 1, as it runs from 1st index
            {

                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j - 1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            //If NONE ITEM was swapped for a value of i, that means the array is sorted
            if(!swapped)
            {
                break;
            }
        }

    }
}