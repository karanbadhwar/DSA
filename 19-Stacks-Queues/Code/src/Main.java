import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws StackException{
        System.out.println("Stacks n Queues");
        /*
            Internally, these are also arrays.

            Stacks - Same when we use Recursion, functions calls keep getting pilled up on stack.
                    * In Stacks, what Comes in First is the last one to be removed.
                    * LIFO -> Last In First Out || FILO -> First In Last Out.
                    * Pop -> Removing an Item to the Stack && Push -> inserting an Item to the Stack

            Queue - Take it as an Example, as Line (People standing in Line).
                    * In Queues, what comes First is the First one to be removed.
                    * FIFO -> First In First Out || LILO -> Last In Last Out.

            Deque (Deck) - Doubly Ended Queue, can insert/Remove from both the sides.

            ArrayDeque - Faster than stack when is being used as Stack and faster than linkedList when used as a queue.
                         * Class Implements Interface Deque, so can insert/remove from both the ends.

         */

//        DynamicStack<Integer> stack= new DynamicStack<>(5);
//
//        stack.push(20);
//        stack.push(45);
//        stack.push(35);
//        stack.push(19);
//        stack.push(56);
//        stack.push(89);
//
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        CustomQueue queue = new CustomQueue(5);
//
//        queue.insert(3);
//        queue.insert(6);
//        queue.insert(9);
//        queue.insert(12);
//        queue.insert(15);
//
//        queue.display();
//
//        System.out.println(queue.remove());
//
//        queue.display();

        CircularQueue queue = new CircularQueue(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

//        System.out.println(queue.front());
        System.out.println(queue.remove());
//        System.out.println(queue.front());

        queue.insert(100);
//
//        System.out.println(queue.front);
        queue.display();
    }
}