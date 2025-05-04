package Strings;

public class Permutations {
    public static void main(String[] args) {
        permutations("", "abc");
    }

    static void permutations(String p, String up)
    {
        //Base Condition
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        //It will run until the length of the Processed String
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i, p.length());
            permutations(first+ch+second, up.substring(1));
        }

    }
}
