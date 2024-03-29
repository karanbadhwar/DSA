public class SplitArrayLargestSum {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        //After this start will be the greatest element out of the array
        //And End will be the total of all the elements - resulting in Range

        //Binary Search
        while(start < end)
        {
            //try for middle as potential answer
            int mid = start + (end - start) /2;

            //Calculate how many pieces we can divide it with this max sum
            int sum = 0;
            int pieces = 1;
            for(int num: nums)
            {
                sum += num;
                if(sum > mid)
                {
                    //Cannot be added in this sub array, make new sub array from num[i]
                    sum = num;
                    pieces++;
                }
            }

            if(pieces > k)
            {
                start = mid + 1;
            } else {
                end = mid;
            }
            
        }

        return end; // here start == end
    }
}
