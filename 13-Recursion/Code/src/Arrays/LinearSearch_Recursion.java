package Arrays;

public class LinearSearch_Recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,4,18,9};
        System.out.println(linearSearch(arr,90,0));
    }

    static boolean linearSearch(int[] arr, int target, int index)
    {
        //Base Condition
        if(index > arr.length-1)
        {
            return false;
        }

//        if(arr[index] == target)
//        {
//            return true;
//        } else {
//            //Recursive Calls
//            return linearSearch(arr,target, index+1);
//        }

        return arr[index] == target || linearSearch(arr,target,index+1);
    }
}
