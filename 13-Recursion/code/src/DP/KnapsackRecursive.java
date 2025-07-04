package DP;

public class KnapsackRecursive {
    public static void main(String[] args) {
        int[] wt = {4,5,1};
        int[] val = {1,2,3};
        int maxProfit = knapsack(wt, val, 4, wt.length);
        System.out.println(maxProfit);
    }

    public static int knapsack(int[] weight, int[] val, int capacity, int n){
        if (n == 0 || capacity <= 0) {
            return 0;
        }

        if(weight[n-1] <= capacity){
            return val[n-1] + knapsack(weight,val,capacity-weight[n-1], n-1);
        }
        return knapsack(weight,val,capacity, n-1);
    }
}
