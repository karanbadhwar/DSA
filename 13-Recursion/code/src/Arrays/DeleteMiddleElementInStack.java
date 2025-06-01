package Arrays;

import java.util.Stack;

public class DeleteMiddleElementInStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        delMidEl(stack);
        System.out.println(stack);
    }

    private static void delMidEl(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int mid = (stack.size() / 2) + 1;
        solve(stack, mid);
        return;
    }

    private static void solve(Stack<Integer> stack, int mid) {
        // Base Condition
        if (mid == 1) {
            stack.pop();
            return;
        }
        int val = stack.pop();
        // Hypothesis
        solve(stack, mid -1);
        stack.push(val);

    }

}
