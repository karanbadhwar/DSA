public class RBC_WithDuplicate {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,7,0,1,2};

        System.out.println(search(arr, 7));
    }

    static public int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicate(nums);

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

    static int findPivotWithDuplicate(int[] arr)
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

            //If elements at middle, start and end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == end) {

                //Checking if the start or end is either the Pivot or not
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

                if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end])
                {
                    start = mid + 1;
                } else {
                    end = mid - 1;
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
