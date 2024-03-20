public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};

        int[] arr2 = {89, 45, 22, 18, 16, 15, 4, 3, 2, 0, -4, -12, -18};
        int target = 22;

//        int ans = orderAgnostic(arr,target);
        int ans = orderAgnostic(arr2,target);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr, int target)
    {
        int s = 0;
        int end = arr.length - 1;

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


        return Integer.MIN_VALUE;
    }
}
