public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,3,1};
        int target = 1;
        System.out.println(search(arr,target));

    }

    static int search(int[] arr, int target)
    {
        int peak = peakIndexInMountainArray(arr);

        int firstTry = orderAgnostic(arr,target, 0, peak);

        if(firstTry != -1)
        {
            return firstTry;
        }
        return orderAgnostic(arr,target, peak + 1, arr.length-1);

    }

    static public int peakIndexInMountainArray(int[] arr) {
        int start= 0;
        int end = arr.length -1;

        while(start < end)
        {
            int mid = start + (end - start) /2;
            if(arr[mid] < arr[mid + 1])
            {
                start = mid + 1;
            } else if(arr[mid] > arr[mid + 1])
            {
                end = mid;
            }

        }
        return start;
    }

    static int orderAgnostic(int[] arr, int target, int s, int end)
    {

        //Find whether if the array is in ASC or DEC
        boolean isAsc = arr[s] < arr[end];


        while(s <= end)
        {
            int mid = s + (end - s)/2;
            if(target == arr[mid])
                return mid;

            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else{
                    s = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    s = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }


//        return Integer.MIN_VALUE;
        return -1;
    }
}
