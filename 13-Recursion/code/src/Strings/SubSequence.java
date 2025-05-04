package Strings;

//Subsets
/*
    Two Rules
    1 - Either we add
    2 - or We remove
 */

import java.util.ArrayList;

//Subsets - for Arrays
//Subsequence - for Strings
public class SubSequence {
    public static void main(String[] args) {
        ArrayList<String> list = subseqRet("", "abcd");
        System.out.println(list);
    }

    //p - processed
    //up - un-processed
    static void subseq(String p, String up)
    {
        if(up.isEmpty()) // if String is empty
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));

    }

    //With ArrayList
    static ArrayList<String> subseqRet(String p, String up)
    {
        if(up.isEmpty()) // if String is empty
        {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }


        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p+ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;

    }
}
