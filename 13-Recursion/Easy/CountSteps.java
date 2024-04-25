//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero

public class CountSteps {
    public static void main(String[] args) {

    }

    public int numberOfSteps(int num) {
        //No. of Args in Recursion function, should also include the same amount of args in the recursion calls,
        // Hence, for other computation and making recursion calls we are taking helper function and will use it as Recursion calls

        return helper(num, 0);
    }

    private int helper(int num, int steps) {
        if(num == 0)
        {
            return steps;
        }

        if(num % 2 == 0)
        {
            return helper(num/2, ++steps)
         } else {
            return helper(num - 1, ++steps);
        }
    }
}
