import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public static void main(String[] args) {
        String str = "a1B2";
        List<String> lcp = letterCasePermutation(str);
        System.out.println(lcp);

    }

    public static List<String> letterCasePermutation(String s) {
        String input = s;
        String output = "";
        ArrayList<String> list = new ArrayList<>();
        solve(input, output, list);
        return list;
    }

    private static void solve(String input, String output, ArrayList<String> list) {
        if (input.isEmpty()) {
            list.add(output);
            return;
        }
        Character ch = input.charAt(0);
        if (Character.isDigit(ch)) {
            solve(input.substring(1), output + ch, list);
        } else {
            solve(input.substring(1), output + Character.toLowerCase(ch), list);
            solve(input.substring(1), output + Character.toUpperCase(ch), list);
        }
    }
}
