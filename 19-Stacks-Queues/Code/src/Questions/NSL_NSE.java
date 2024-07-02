package Questions;

import java.util.ArrayList;
import java.util.Stack;

public class NSL_NSE {
    //Nearest Smallest to Left or Nearest Smallest Element

    public static ArrayList<Integer> NSL(int[] arr)
    {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            //If Stack is Empty
            if(stack.empty())
            {
                result.add(-1);
            } else if(stack.peek() < arr[i]) {
                result.add(stack.peek());
            } else if(stack.peek() > arr[i]){
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

        return result;
    }



    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};

        System.out.println(NSL(arr));
    }
}
