//https://leetcode.com/problems/set-mismatch/description/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};

        int[] mismatch = findErrorNums(arr);

        System.out.println(Arrays.toString(mismatch));
    }

    public static int[] findErrorNums(int[] nums) {

        int i = 0;
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

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] - 1 != j)
            {
                return new int[]{nums[j], j + 1};
            }
        }

        return new int[]{-1,-1};
    }
    static void swap(int[] arr, int presentIndex, int correctIndex)
    {
        int temp = arr[presentIndex];
        arr[presentIndex] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
