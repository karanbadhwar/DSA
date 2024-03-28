public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
        int target = 4;
        int ans =  search(arr,target);
    }

    static public int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        //If you did not find a pivot, it means array is not rotated
        if(pivot == -1)
        {
            //Just do normal Binary Search
            return binarySearch(nums, target, 0 , nums.length-1);
        }

        //If pivot is found that means we got 2 ASC sorted arrays
        if(nums[pivot] == target)
        {
            return pivot;
        }

        if(target >= nums[0])
        {
            return binarySearch(nums,target, 0, pivot-1);
        }else
        {
            return binarySearch(nums,target, pivot + 1, nums.length-1);
        }


    }

    static int findPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            //4 Cases

            //Case 1
            if (mid < end && arr[mid] > arr[mid + 1])
            {
                return mid;
            }

            //Case 2
            if(mid > start && arr[mid] < arr[mid-1])
            {
                return mid - 1;
            }

            // Case3
            if(arr[start] >= arr[mid])
            {
                end = mid - 1;
            }

            // Case 4
            if(arr[start] < arr[mid])
            {
                start = mid +1;
            }

        }
        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end)
    {

        while(start <= end)
        {
            //find the middle element
//            int mid = (start + end)/2;// It can cause Integer overflow, if both numbers addition exceeds Integer.MAX_VALUE

            int mid = start + (end-start)/2;

            if(target < arr[mid])
            {
                end = mid -1;
            } else if(target > arr[mid])
            {
                start = mid + 1;
            } else
            {
                return mid;
            }

        }

        return -1;
    }
}
