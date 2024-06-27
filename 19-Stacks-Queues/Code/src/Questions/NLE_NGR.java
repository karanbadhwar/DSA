package Questions;

import java.util.ArrayList;
import java.util.Stack;

public class NLE_NGR {

    /*
        3 conditions:
         1 -> Stack is empty -> return -1;
         2 -> Stack.top() > arr[i] -> return stack.peek();
         3 -> stack.top()< arr[i]
                1 -> stack.pop()
                2 -> stack.top > arr[i] -> return stack.peek()
     */
    public static ArrayList<Integer> NGR(int[] arr)
    {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length-1; i >= 0; i--) {
            //Condition 1
            if(stack.empty())
            {
                result.add(-1);

            }

            //Condition 2
            else if(!stack.isEmpty() && stack.peek() > arr[i])
            {
                result.add(stack.peek());
            }

            //Condition 3
            else if(!stack.isEmpty() && stack.peek() <= arr[i])
            {
                while(!stack.isEmpty() && stack.peek() <= arr[i])
                {
                    stack.pop();
                }
                if(stack.empty())
                {
                    result.add(-1);
                }else {
                    result.add(stack.peek());
                }

            }
            stack.push(arr[i]);
        }
        ArrayList<Integer> finalResult = new ArrayList<>();
        for (int i = result.size()-1; i >= 0; i--) {
            finalResult.add(result.get(i));
        }
//        System.out.println(stack);
        return finalResult;
    }
    public static void main(String[] args) {
        //Concepts of Stack
        // NGR -> Nearest Greatest to Right aka NLE -> Next Largest Element

        int[] arr = {1,3,2,4};
        System.out.println(NGR(arr));
    }
}
