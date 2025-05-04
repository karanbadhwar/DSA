package Arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(BS_Recur(arr,8,0,arr.length-1));
    }

    static int BS_Recur(int[] arr, int target, int start, int end)
    {
        //Base Condition
        if(start > end)
        {
            return -1;
        }

        int mid = start + (end - start)/2;
        if(arr[mid] == target)
        {
            return mid;
        }

        if(arr[start] <= arr[mid] )
        {
            if(target <= arr[mid] && target >= arr[start]) {
                return BS_Recur(arr, target, start, mid - 1);
            } else {
                return BS_Recur(arr,target, mid + 1, end);
            }
        }

        if(target >= arr[mid] && target <= arr[end])
        {
            return BS_Recur(arr,target, mid + 1, end);
        } else {
            return BS_Recur(arr, target, start, mid - 1);
        }
    }
}
