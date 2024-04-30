package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,8,1};
        selectionSort(arr,4,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr, int row, int col, int max)
    {
        if(row == 0)
        {
            return;
        }

        if(row > col)
        {
            if(arr[col] > arr[max])
            {
                selectionSort(arr,row, col+1,col);
            } else
            {
                selectionSort(arr,row, col+1,max);
            }

        } else
        {
            //Swap
            int temp = arr[row-1];
            arr[row-1] = arr[max];
            arr[max] = temp;
            selectionSort(arr,row-1, 0,0);
        }

    }
}
