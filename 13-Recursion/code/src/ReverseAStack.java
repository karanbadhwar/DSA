import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

// reverse a stack with O(1) space
public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        reverseStack(stack);
        System.out.println(stack);

    }

    private static void reverseStack(Stack<Integer> stack){
        // Base Condition
        if (stack.size() <= 1) {
            return;
        }

        int temp = stack.pop();
        // Hypothesis
        reverseStack(stack);

        // Induction
        insertInStack(stack, temp);

    }

    private static void insertInStack(Stack<Integer> stack, int temp) {
        // Base Condition
        if (stack.empty()) {
            stack.push(temp);
            return;
        }

        int val = stack.pop();
        // Hypothesis
        insertInStack(stack, temp);

        // Induction
        stack.push(val);
    }

}
