package Strings;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationCount {
    public static void main(String[] args) {
        System.out.println(count("", "23"));
    }

    static int count(String p, String up)
    {
        //Base Condition
        if(up.isEmpty())
        {
            return 1;
        }

        int count = 0;
//        String str = up.substring(0,1);
//
//        int num = Integer.parseInt(str);

        int num = up.charAt(0) - '0';
        for (int i = (num-1)*3; i < num*3; i++) {
            char ch = (char)('a'+i);
            count+= count(p+ch, up.substring(1));
        }
        return count;

    }
}
