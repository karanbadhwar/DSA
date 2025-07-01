//https://www.geeksforgeeks.org/problems/print-n-bit-binary-numbers-having-more-1s-than-0s0252/1

import java.util.ArrayList;

public class NbitBinaryPrefix {
    public static void main(String[] args) {
        ArrayList<String> result = NBitBinary(3);
        System.out.println(result);
    }

    public static ArrayList<String> NBitBinary(int N) {
        int one = 0;
        int zero = 0;
        ArrayList<String> list = new ArrayList<>();
        solve("1", 1, zero, N - 1, list);
        return list;
    }

    private static void solve(String output, int one, int zero, int n, ArrayList<String> result) {
        if (n == 0) {
            result.add(output);
            return;
        }

//        if (zero == one) {
//            solve(output + "1", one + 1, zero, n - 1, result);
//            return;
//        }
        solve(output + "1", one + 1, zero, n - 1, result);
        if (one > zero)
            solve(output + "0", one, zero + 1, n - 1, result);

    }

}
