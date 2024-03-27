public class ElementInInfiniteArray {

    //In Infinite array we mean that we cannot use array.length function
    public static void main(String[] args) {

        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;

        System.out.println(answer(arr,target));
//        System.out.println(myWay(arr,target));

    }

//    static int myWay(int[] arr, int target){
//        int start = target / 2;
//        int end =  start + 1;
//
//        if(target > arr[end])
//        {
//            int temp = end + 1;
//            end = end + (end - start + 1) * 2;
//            start =temp;
//        }
//        return binarySearch(arr, target, start, end);
//    }

    static int answer(int[] arr, int target)
    {
        //First find the range
        //Start with box of size 2
        int start = 0;
        int end = 1;
        if( target > arr[end])
        {
            int temp = end + 1;
            //Double the box value
            //end = prev end + sizeofthebox * 2;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
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
