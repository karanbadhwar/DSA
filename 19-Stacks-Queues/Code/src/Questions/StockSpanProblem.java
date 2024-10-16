package Questions;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpanProblem {
    //Stock Span problem

    

    public static ArrayList<Integer> stockSpan(int[] arr)
    {
    ArrayList<Integer> result = new ArrayList<>();
//    ArrayList<Integer> index = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length ; i++) {
            if(stack.empty())
            {
                result.add(1);
            } else if(!stack.empty() && arr[stack.peek()] > arr[i]) {
                result.add(1);
            } else if(!stack.empty() && arr[stack.peek()] < arr[i])
            {
                while(!stack.empty() && arr[stack.peek()] < arr[i])
                {
                    stack.pop();
                }

                if(stack.empty())
                {
                    result.add(i - stack.peek() + 1);
                } else {
                    result.add(i - stack.peek());
                }
            }
            stack.push(i);
        }

    return result;
    }

    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        System.out.println(stockSpan(arr));
    }
}
