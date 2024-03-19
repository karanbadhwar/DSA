public class BinarySearch {
    public static void main(String[] args) {
        //Binary Search - Binary search is for Sorted Arrays either ASC or DEC
        /*
            Time Complexity :-
            Best Case - O(1)
            Worst Case - O(logN)
         */
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        int ans = binarySearch(arr,target);

        System.out.println(ans);
    }

    //Return the index
    //Return -1 if it does not exist
    static int binarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length-1;

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