package Strings;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PermutationArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list = permutationsList("", "abc");
        System.out.println(list);

        System.out.println(permutationsCount("", "abc"));
    }

    static ArrayList<String> permutationsList(String p, String up) {
        //Base Condition
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        //It will run until the length of the Processed String
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            ans.addAll(permutationsList(first + ch + second, up.substring(1)));

        }
        return ans;

    }

    //returning Count
    static Integer permutationsCount(String p, String up) {
        //Base Condition
        if (up.isEmpty()) {
            return 1;
        }

        char ch = up.charAt(0);

        int count = 0;

        //It will run until the length of the Processed String
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i, p.length());
            count += permutationsCount(first + ch + second, up.substring(1));


        }
        return count;

    }
}
