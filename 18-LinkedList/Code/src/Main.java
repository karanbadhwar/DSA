import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linked List");

        /*
            Linked List: -
                * It will not put the block of individual Item in contiguous memory.
                * There are Three Linked Lists -> Singly, Doubly and Circular.
                * Particular Block/Box is called Nodes.
                * Head Ref Variable -> points to First Node.
                * Tail Ref Variable -> points to Last Node.

                * Representation of Every Node
                    1 - Value
                    2 - Next Node Address

                * Class Representation (Creating Custom Linked List)
                    class Node{
                        int value;
                        Node nextNode;
                    }

                * Tail Points to Null
                * Cannot Access the Direct Node with Indexing, as a Node only has idea about the Next Node it is Pointing to.

         */

        CustomLinkedList list = new CustomLinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.display();
//        LinkedList<Integer> internalList = new LinkedList<>();
//        internalList.getFirst();//Head

        }
    }