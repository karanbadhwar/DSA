package Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class Dice {
    public static void main(String[] args) {
        diceRoll("", 4);
    }
    static void diceRoll(String p, int target)
    {
        if(target == 0)
        {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            diceRoll(p+i, target - i);
        }
    }

    //Returning a list
    static ArrayList<String> diceRollRet(String p, int target)
    {
        if(target == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceRollRet(p+i, target - i));
        }
        return list;
    }

    //Custom Face Dice
    static void diceFace(String p, int target, int face)
    {
        if(target == 0)
        {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p+i, target - i, face);
        }
    }
}
