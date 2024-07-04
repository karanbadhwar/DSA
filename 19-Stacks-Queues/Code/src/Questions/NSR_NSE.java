package Questions;

import java.util.ArrayList;
import java.util.Stack;

public class NSR_NSE {
    //NSR -> Nearest Smallest to Right
    
    public static ArrayList<Integer> NSR(int[] arr)
    {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length-1; i >= 0; i--) {
            if(stack.empty())
            {
                result.add(-1);
            } else if(!stack.empty() && stack.peek() < arr[i])
            {
                result.add(stack.peek());
            } else if (!stack.empty() && stack.peek() > arr[i]) {
                while(!stack.empty() && stack.peek() > arr[i])
                {
                    stack.pop();
                }

                if(stack.empty())
                {
                    result.add(-1);
                } else {
                    result.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }
        ArrayList<Integer> finalResult = new ArrayList<>();
        for (int i = (result.size() - 1); i >= 0; i--) {
            finalResult.add(result.get(i));
        }

        return finalResult;
    }


    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};

        System.out.println(NSR(arr));
    }
}
