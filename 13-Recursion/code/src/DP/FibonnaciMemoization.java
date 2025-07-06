package DP;


import java.util.Arrays;

public class FibonnaciMemoization {
    private static int[] arr = new int[6];
    static {
        Arrays.fill(arr, -1);
    }
    public static void main(String[] args) {

        int result = fib(5);
        System.out.println(result);
    }

    public static int fib(int n) {
        System.out.println("Calling fib(" + n + ")");
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        if(arr[n] != -1){
            return arr[n];
        }
        return arr[n] = fib(n-1)+fib(n-2);
    }
}
