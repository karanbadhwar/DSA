package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> list = subsetDup(arr);
        for(List<Integer> l: list)
        {
            System.out.println(l);
        }

    }

    /*
        Step 1 - Sort the array to make the elements adjacent
     */
    static List<List<Integer>> subsetDup(int[] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for(int i = 0; i < arr.length; i++)
        {
            start = 0;

            if(i > 0 && arr[i] == arr[i-1])
            {
                start = end + 1;
            }

            end = outer.size()-1;
            int size = outer.size();
            for (int j = start; j < size; j++)
            {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
