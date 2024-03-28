public class RotationCount {
    public static void main(String[] args) {
//        int[] arr = {4,5,6,7,0,1,2};
        int[] arr = {1,2,3,4,5,6};
        System.out.println(countRotation(arr));

    }

    static int countRotation(int[] arr) {
        int pivot = findingPivot(arr);
        if(pivot == -1)
        {
            return 0;
        } else{
            return pivot + 1;
        }
    }

    static int findingPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length -1;

        while(start <= end)
        {
            int mid = start + (end -start) / 2;

            if(mid > end && arr[mid] > arr[mid + 1])
            {
                return mid;
            }

            if(start < mid && arr[mid] < arr[mid - 1])
            {
                return mid - 1;
            }


            if(arr[start] == arr[mid] && arr[mid] == arr[end])
            {
                if(arr[start] > arr[start + 1])
                {
                    return start;
                }
                start++;

                if(arr[end] < arr[end - 1])
                {
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
}
