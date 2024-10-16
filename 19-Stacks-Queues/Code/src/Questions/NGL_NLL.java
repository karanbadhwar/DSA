package Questions;

import java.util.ArrayList;
import java.util.Stack;

public class NGL_NLL {
    //Nearest Greater to Left

    public static ArrayList<Integer> NGL(int[] arr)
    {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= arr.length - 1; i++) {
            //If Stack is Empty
            if(stack.empty())
            {
                result.add(-1);
            }else if (!stack.empty() && arr[i] < stack.peek()){
                result.add(stack.peek());
            } else if(!stack.empty() && arr[i] > stack.peek()){
                while(!stack.empty() && stack.peek() < arr[i])
                {
                    stack.pop();
                }

                result.add(stack.empty()? -1 : stack.peek());
            }
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4};
        System.out.println(NGL(arr));
    }
}
