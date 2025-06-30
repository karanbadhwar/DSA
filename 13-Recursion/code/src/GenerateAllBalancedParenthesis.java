import java.util.ArrayList;
import java.util.Arrays;

public class GenerateAllBalancedParenthesis {
    public static void main(String[] args) {
        String[] balancedParenthesis = generateParenthesis(3);
        System.out.println(Arrays.toString(balancedParenthesis));
    }

    public static String[] generateParenthesis(int A) {
        int open = A;
        int close = A;
        ArrayList<String> list = new ArrayList<>();
        solve(open,close,list, "");
        return list.toArray(new String[0]);
    }

    private static void solve(int open, int close, ArrayList<String> arr, String output) {
        if(open == 0 && close == 0){
            arr.add(output);
            return;
        }

//        if (close == 0 || open == close) {
//            solve(open-1, close, arr, output+"(");
//        }else if(open == 0){
//            solve(open, close-1, arr, output+")");
//        }else{
//            solve(open-1, close, arr, output+"(");
//            solve(open, close-1, arr, output+")");
//        }

        if (open > 0) {
            solve(open - 1, close, arr, output + "(");
        }

        if (close > open) {
            solve(open, close - 1, arr, output + ")");
        }


    }
}
