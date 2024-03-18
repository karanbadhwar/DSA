public class Main {
    public static void main(String[] args) {
        //Linear Search
        /*
            Time Complexity - How the time grows, as the size/Input grows!!
            Best: O(1) // Constant
            worst case: O(N) // n -> size of array

            Space Complexity - How many variables are taken to find out the Item

         */

        int[] nums = {23,45,1,2,19,-3,16,-11,28};

        int target = 19;

        int ans = linearSearch(nums, target);

        System.out.println(ans);

    }

    // Search in the array
    //Return the index if item found otherwise return -1
    static int linearSearch(int[] arr, int target)
    {
        if(arr.length == 0)
            return -1;

        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index, if it is = target
            if(arr[index] == target)
                return index;
        }

        //this line will execute, if none of the return statements above have executed
        return -1;
    }
}