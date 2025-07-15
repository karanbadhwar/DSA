//https://leetcode.com/problems/maximum-subarray/description/
package arrayQuestions;

public class MaximumSubArray {

    public static void main(String[] args) {
//        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr = {5,4,-1,7,8};
        System.out.println(maxSubArray(arr));
    }

    // Brute Force
//    public static void maxSubArray(int[] nums) {
//        int max = 0;
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for (int j = i; j < nums.length; j++) {
//                sum+=nums[j];
//                if (max < sum){
//                    max = sum;
//                }
//            }
//
//        }
//        System.out.println(max);
//    }

    // Kadane's Algo
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }
        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(max, sum);
        }

        return max;
    }
}
