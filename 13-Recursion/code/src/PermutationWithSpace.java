

public class PermutationWithSpace {
    public static void main(String[] args) {
        String input = "ABC";
        String output = "";
        permWithSpace(input, output);
    }

    private static void permWithSpace(String input, String output) {
        if(output.isEmpty()) output+=input.charAt(0);
        solve(input.substring(1), output);
    }

    private static void solve(String input, String output) {
        if (input.isEmpty()) {
            System.out.println(output);
            return;
        }
        char ch = input.charAt(0);
        solve(input.substring(1), output+" "+ch);
        solve(input.substring(1), output+ch);
    }
}
