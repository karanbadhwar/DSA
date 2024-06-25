package Questions;

//https://www.hackerrank.com/challenges/game-of-two-stacks/problem

import java.util.ArrayList;
import java.util.List;


public class GameOfTwoStacks {

    public static int twoStacks( int maxSum, List<Integer> a, List<Integer> b) {
        return twoStacks(0,maxSum,0,0, a, b) - 1;
    }

    private static int twoStacks(int count, int maxSum, int indexA, int indexB,List<Integer> a, List<Integer> b)
    {
        //Base Condition
        if(maxSum < 0)
        {
            return count;
        }
        if(indexA == a.size() || indexB == b.size())
        {
            return count;
        }


        int removedA = a.get(indexA);

        int removedB = b.get(indexB);



        int left = twoStacks( count+1,maxSum - removedA, indexA+1,indexB,a,b);
        int right = twoStacks( count+1,maxSum - removedB, indexA, indexB + 1,a,b);


        return Math.max(left,right);

    }


    public static void main(String[] args) {
       ArrayList<Integer> a = new ArrayList<>();
       a.add(4);
       a.add(2);
       a.add(4);
       a.add(6);
       a.add(1);
       ArrayList<Integer> b = new ArrayList<>();
        b.add(2); 
        b.add(1);
        b.add(8);
        b.add(5);
//        System.out.println(twoStacks(0,10,a,b));
    }


}
