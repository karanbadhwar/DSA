package Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MaxHistogram {

    public static void MaxHist(int[] arr)
    {
        ArrayList<Integer> left = NSL(arr);
        System.out.println(left);
        ArrayList<Integer> right = NSR(arr);
        System.out.println(right);
        int max = 0;
        int[] width = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            width[i] = right.get(i) - left.get(i) - 1;
            if(max < width[i] * arr[i])
            {
                max = width[i] * arr[i];
            }
        }
        
        System.out.println(max);

    }

    public static ArrayList<Integer> NSR(int[] arr)
    {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();
        int pseudoIndex = arr.length;

        for (int i = arr.length-1; i >= 0; i--) {
              if(stack.empty())
            {
                result.add(pseudoIndex);
            }
            else if (!stack.empty() && stack.peek().getVal() < arr[i])
            {
                result.add(stack.peek().getIndex());
            } else if(!stack.empty() && stack.peek().getVal() > arr[i])
            {
                while(!stack.empty() && stack.peek().getVal() > arr[i])
                {
                    stack.pop();
                }

                if(stack.empty()? result.add(-1): result.add(stack.peek().getIndex()));
            }
            stack.push(new Pair(i, arr[i]));
        }

        Collections.reverse(result);
        return result;

    }

    // Neaerest Smallest to left 
    public static ArrayList<Integer> NSL(int[] arr)
    {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();
        int pseudoIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if(stack.empty())
            {
                result.add(pseudoIndex);
            }
            else if (!stack.empty() && stack.peek().getVal() < arr[i])
            {
                result.add(stack.peek().getIndex());
            } else if(!stack.empty() && stack.peek().getVal() > arr[i])
            {
                while(!stack.empty() && stack.peek().getVal() > arr[i])
                {
                    stack.pop();
                }

                if(stack.empty()? result.add(-1): result.add(stack.peek().getIndex()));
            }
            stack.push(new Pair(i, arr[i]));

        }

        return result;
        
    } 

    public static void main(String[] args) {
        MaxHist(new int[]{2,1,5,6,2,3});
    }
}

class Pair{
        private int index;
        private int val;

        public Pair(int index, int val) {
            this.index = index;
            this.val = val;
        }
        public int getIndex() {
            return index;
        }
        public int getVal() {
            return val;
        }
        public void setIndex(int index) {
            this.index = index;
        }
        public void setVal(int val) {
            this.val = val;
        }
    }