package Easy;

import java.util.Stack;

public class SortAStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(0);
        stack.push(1);
        stack.push(2);
        sortAStack(stack);
        System.out.println(stack);
    }

    private static void sortAStack(Stack<Integer> stack) {
        // Base Condition
        if (stack.size() <= 1) {
            return;
        }

        int temp = stack.pop();
        // Hypothesis
        sortAStack(stack);

        // Induction
        insertIntoStack(stack, temp);
    }

    private static void insertIntoStack(Stack<Integer> stack, int temp) {
        // Base Condition
        if (stack.empty() || stack.getLast() < temp) {
            stack.push(temp);
            return;
        }

        int val = stack.pop();
        // Hypothesis
        insertIntoStack(stack, temp);

        // Induction
        stack.push(val);

    }
}
