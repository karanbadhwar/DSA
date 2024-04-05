//https://leetcode.com/problems/first-missing-positive

public class FirstPositiveMissing {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};

        int missing = firstMissingPositive(arr);
        System.out.println(missing);
    }

        public static int firstMissingPositive(int[] nums)
        {
            int i = 0;
            while(i < nums.length)
            {
                int correctIndex = nums[i] - 1;
                if( nums[i] > 0 && nums[i] != nums[correctIndex]  && nums[i] <= nums.length)
                {
                    swap(nums,i, correctIndex);
                } else {
                    i++;
                }
            }


            //Search for Missing Number
            for (int index = 0; index < nums.length; index++)
            {
                if(index + 1 != nums[index])
                {
                    return index + 1;
                }

            }

            //Case 2
            return nums.length + 1;
        }
    public static void swap(int[] arr, int presentIndex, int correctIndex)
        {
            int temp = arr[presentIndex];
            arr[presentIndex] = arr[correctIndex];
            arr[correctIndex] = temp;
        }

}
