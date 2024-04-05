import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1};
        int mNum = missingNumber(arr);
        System.out.println(mNum);

    }

    public static int missingNumber(int[] nums)
    {
        int i = 0;
        while(i < nums.length)
        {
            if(nums[i] != i  && nums[i] != nums.length)
            {
                swap(nums,i, nums[i]);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++)
        {
            if(j != nums[j])
            {
                return j;
            }

        }

        return nums.length;
    }

    static void swap(int[] arr, int presentIndex, int correctIndex)
    {
        int temp = arr[presentIndex];
        arr[presentIndex] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}

/*
Optimized Code
 int n = nums.length;
        int nSum = (n*(n+1))/2;
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            sum+=nums[i];
        }
        return nSum-sum;
 */