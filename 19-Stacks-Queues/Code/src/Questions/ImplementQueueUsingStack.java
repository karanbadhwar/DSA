package Questions;

//https://leetcode.com/problems/implement-queue-using-stacks

import java.util.Stack;

public class ImplementQueueUsingStack {
    private Stack<Integer> main;
    private Stack<Integer> helper;

    public ImplementQueueUsingStack() {
        main = new Stack<>();
        helper = new Stack<>();
    }


    public void push(int x) {

        //Linear Time Complexity for Insertion
        /*
            while(!main.isEmpty())
            {
                helper.push(main.pop());
            }
            main.push(x);
            while(!helper.isEmpty())
            {
                main.push(helper.pop());
             }
         */

        main.push(x);
    }

    public int pop() {
        while(!main.isEmpty())
        {
            helper.push(main.pop());
        }

        int removed = helper.pop();

        while(!helper.isEmpty())
        {
            main.push(helper.pop());
        }
        return removed;
    }

    public int peek() {
        return main.getFirst();
    }

    public boolean empty() {
        return main.isEmpty();
    }

}
