package DP;
import java.util.stream.IntStream;

public class KnapsackMemoization {

    public static void main(String[] args) {
        int[] wt = {4,1,4,5,1};
        int[] val = {1,3,1,2,3};
        int capacity = 4;
        int[][] arr = IntStream.range(0,val.length+1)
                .mapToObj(i-> IntStream.generate(() -> -1).limit(capacity+1).toArray())
                .toArray(int[][]::new);
        int maxProfit = knapsack(wt, val, capacity, wt.length,arr);
        System.out.println(maxProfit);
    }

    public static int knapsack(int[] weight, int[] val, int capacity, int n, int[][] matrix){
        if (n == 0 || capacity <= 0) {
            return 0;
        }

        // Checking for the value in the Matrix.
        if (matrix[n][capacity] != -1){
            return matrix[n][capacity];
        }

        if(weight[n-1] <= capacity){
            int include = val[n-1] + knapsack(weight,val,capacity-weight[n-1], n-1,matrix);
            int exclude= knapsack(weight,val,capacity, n-1,matrix);
            int maxValue =  Math.max(include,exclude);
            matrix[n][capacity] = maxValue;
            return maxValue;
        }
        return matrix[n][capacity] = knapsack(weight,val,capacity, n-1,matrix);
    }




}
