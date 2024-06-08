package Questions;


//https://leetcode.com/problems/sort-list

public class LLBubbleSort {

    public static void main(String[] args) {
        LLBubbleSort list = new LLBubbleSort();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.bubbleSort();

        list.display();
    }

    private ListNode head;
    private int size = 0;

    public void insert(int value)
    {
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;
        size++;
    }

    public void display()
    {
        //Imp to take extra temp Node type Variable, if we do this with Head, head itself will move the structure.
        ListNode temp = head;

        while(temp != null)
        {
            System.out.print(temp.val + " -> ");
            temp = temp.next; // Moving temp forward
        }
        System.out.println("END");
    }

    //Bubble Sort
    public void bubbleSort()
    {
        bubbleSort( size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if(row <= 0)
        {
            return;
        }

        if(col < row)
        {
            ListNode first = get(col);
            ListNode second = get(col + 1);

            if(first.val > second.val)
            {
                //Swapping

                if(first == head)
                {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if(second.next == null)
                {
                    ListNode prev = get(col -1);
                    prev.next = second;
                    second.next = first;
                    first.next = null;
                } else {
                    ListNode prev = get(col -1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row-1, col );
        }
    }

    private ListNode get(int index)
    {
        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
//        System.out.println("Second last Node" + node.value); // For Fixing Bug
        return node;
    }


    private static class ListNode {
        int val;
        ListNode next;


        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }


}
