package Strings;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    public static void main(String[] args) {
        System.out.println(combinations("", "12"));
    }

    static List<String> combinations(String p, String up)
    {
        //Base Condition
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
//        String str = up.substring(0,1);
//
//        int num = Integer.parseInt(str);

        int num = up.charAt(0) - '0';
        for (int i = (num-1)*3; i < num*3; i++) {
            char ch = (char)('a'+i);
            list.addAll(combinations(p+ch, up.substring(1)));
        }
        return list;

    }
}
