package DP;

import java.util.Arrays;

public class KnapsackTabulation {
    public static void main(String[] args) {
        int[] wt = {4,5,1};
        int[] val = {1,2,3};
        int capacity = 4;
        int maxProfit = kp(wt,val,wt.length,capacity);
        System.out.println(maxProfit);
    }

    public static int kp(int[] wt, int[] val, int n, int W){
        int[][] dp = new int[n+1][W+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else if(wt[i-1] <= j){
                    dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]], dp[i-1][j]);
                } else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        for(int[] arr: dp){
            System.out.println(Arrays.toString(arr));
        }
        return dp[n][W];
    }
}
