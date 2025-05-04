package Strings;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        System.out.println(letterCombinations("9"));
    }
public static  List<String> letterCombinations(String digits) {
    if (digits.isEmpty()) {
        return new ArrayList<>();
    }

    return combinations("", digits);
}

static List<String> combinations(String p, String up) {
    // Base Condition
    if (up.isEmpty()) {
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
    }

    ArrayList<String> list = new ArrayList<>();

    int num = up.charAt(0) - '0';

    int start = (num-2)*3;
    int end = (num-1)*3;
    if(num > 7)
    {
        start = (num-2)*3+1;
    }

    if(num >= 7 && num <9)
    {
        end = (num-1)*3+1;
    } else if(num == 9)
    {
        end =(num-1)*3 +2;
    }

    for (int i = start; i < end; i++) {
        char ch = (char) ('a' + i);
        list.addAll(combinations(p + ch, up.substring(1)));
    }

    return list;

}
}