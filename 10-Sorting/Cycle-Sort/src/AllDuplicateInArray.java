//https://leetcode.com/problems/find-all-duplicates-in-an-array/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        ArrayList<Integer> list = new ArrayList<>(findDuplicates(arr));
        System.out.println(list);
        System.out.println(Arrays.toString(arr));

    }
    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;

        //Looping through the Array
        while(i < nums.length)
        {
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex])
            {
                swap(nums, i , correctIndex);
            } else {
                i++;
            }
        }

        //Searching through sorted array now to find missing numbers
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] - 1 != j)
            {
                list.add(nums[j]);
            }
        }

        return list;
    }

    static void swap(int[] arr, int presentIndex, int correctIndex)
    {
        int temp = arr[presentIndex];
        arr[presentIndex] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
