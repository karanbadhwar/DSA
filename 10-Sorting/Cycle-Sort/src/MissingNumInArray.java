//Question :-
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array

import java.util.ArrayList;
import java.util.List;
public class MissingNumInArray {
    public static void main(String[] args) {
        int[] arr ={4,3,2,7,8,2,3,1};
        ArrayList<Integer> list = new ArrayList<>( findDisappearedNumbers(arr));
        System.out.println(list);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length)
        {
            //Range starts from 1 to N
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex] )
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
                list.add(j + 1);
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

