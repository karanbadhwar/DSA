public class PeakOfMountain {
    public static void main(String[] args) {
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndexInMountainArray(arr));
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
}
