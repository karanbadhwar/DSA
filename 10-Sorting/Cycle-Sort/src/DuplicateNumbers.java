public class DuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int duplicate = findDuplicate(arr);
        System.out.println(duplicate);
    }

    public static int findDuplicate(int[] nums)
    {
        int i = 0;

        //Looping through the Array
        while(i < nums.length)
        {
            if(nums[i] != i + 1)
            {
                int correctIndex = nums[i] -1;
                if(nums[i] != nums[correctIndex])
                {
                        swap(nums, i, correctIndex);
                } else {
                        return nums[i];
                    }
            } else{
                i++;
            }
        }

        return -1;
    }

    static void swap(int[] arr, int presentIndex, int correctIndex)
    {
        int temp = arr[presentIndex];
        arr[presentIndex] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
