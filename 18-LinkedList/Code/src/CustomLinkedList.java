import Questions.LLBubbleSort;

public class CustomLinkedList {

    private Node head;
    private Node tail;

    private int size;

    public CustomLinkedList() {
        this.size = 0;
    }

    // Adding a Node in the front.
    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null)
        {
            tail = head;
        }
        size+=1;
    }

    //Adding the element at the Last (End)
    public void insertLast(int val)
    {
        //Checking if Tail is Empty, that means list is empty
        if(tail == null)
        {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //Inserting element at the given Index
    public void insert(int val, int index) throws IndexOutOfBoundsException
    {
        if(index > size)
        {
            throw new IndexOutOfBoundsException("Index Provided was more than the actual size");
        }

        if(index == 0)
        {
            insertFirst(val);
            return;
        }
        if(index == size)
        {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;

    }

    //Insert using Recursion
    public void insertRec(int val, int index)
    {
        head = insertRec(val,index,head);
    }

    private Node insertRec(int val, int index, Node node)
    {
        // Base condition
        if(index == 0)
        {
            Node newNode = new Node(val, node);
            size++;
            return newNode;
        }

        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    //Deleting the First Element
    public int deleteFirst()
    {
        if( size == 0)
        {
            throw new IndexOutOfBoundsException("Cannot delete from an empty list");
        }

        int value = head.value;
        head = head.next;
        if(head == null)
        {
            tail = null;
        }
        size--;
        return value;
    }

    //Deleting the Last Element
    public int deleteLast()
    {
        if(size <= 1)
        {
            return deleteFirst();

        }

        Node secondLast = get(size - 2);
        int value = tail.value;
        secondLast.next = null;
        tail = secondLast;
        size--;
        return value;
    }

    //Deleting a particular Node
    public int delete(int index)
    {
        //Deleting First Index
        if(index == 0)
        {
            return deleteFirst();
        }

        //Deleting Last Index
        if(index == size -1)
        {
            return deleteLast();
        }

        Node previous = get(index - 1);

        int value = previous.next.value;
        previous.next = previous.next.next; // Accessing the Next Node's next.
        size--;
        return value;
    }

    //Getting the Node from the value being passed.
    private Node find(int value)
    {
        Node node = head;
        while(node != null)
        {
            if(node.value == value)
            {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    //Getting the value of a Particular Node
    private Node get(int index)
    {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
//        System.out.println("Second last Node" + node.value); // For Fixing Bug
        return node;
    }

    // Displaying the Linked List
    //TC -> O(N)
    public void display()
    {
        //Imp to take extra temp Node type Variable, if we do this with Head, head itself will move the structure.
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.value + " -> ");
            temp = temp.next; // Moving temp forward
        }
        System.out.println("END");
    }


    private class Node{
        private int value;
        private Node next; // By default, it is Null

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    //QUESTIONS

    //Deleting Duplicates
    public void deleteDuplicates()
    {
        Node temp = head;

        if(head == null)
        {
            return;
        }

        while(temp.next != null)
        {
            if( temp.value == temp.next.value)
            {
                temp.next = temp.next.next;
                size--;
            } else {
                temp = temp.next;
            }
        }
        tail = temp;
    }

    //Merge Two Sorted Lists
    public static CustomLinkedList mergeTwoLists(CustomLinkedList first, CustomLinkedList second)
    {
        Node f = first.head;
        Node s = second.head;

        CustomLinkedList ans = new CustomLinkedList();

        //Termination Condition
        while(f != null && s != null)
        {
            //Comparing the values
            if(f.value < s.value)
            {
                ans.insertLast(f.value);
                f= f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        //Checking if any list is left with few nodes
        while(f != null)
        {
            ans.insertLast(f.value);
            f = f.next;
        }

        while(s != null)
        {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;

    }

/* Leetcode submitted Merge Two Linked Lists
public ListNode mergeTwoLists(ListNode first, ListNode second) {
        ListNode mergedHead = new ListNode();
        ListNode temp = mergedHead;

        while(first != null && second != null)
        {
            if(first.val < second.val)
            {
                temp.next = first;
                first = first.next;
                temp = temp.next;
            } else {
                temp.next = second;
                second = second.next;
                temp = temp.next;
            }
        }

        while(first != null)
        {
            temp.next = first;
            first = first.next;
            temp = temp.next;
        }

        while(second != null)
        {
            temp.next = second;
            second = second.next;
            temp = temp.next;
        }
        return mergedHead.next;
    }
 */

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
            Node first = get(col);
            Node second = get(col + 1);

            if(first.value > second.value)
            {
                //Swapping
                // Cases
                if(first == head)
                {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if(second == tail)
                {
                    Node prev = get(col -1);
                    prev.next = second;
                    second.next = first;
                    first.next = null;
                    tail = first;

                } else {
                    Node prev = get(col -1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row-1, 0 );
        }
    }

    //Reversing Linked List with Recursion
    private void reverse(Node node)
    {
        //Base Condition
        if(node == tail)
        {
            head = tail;
            return;
        }

        reverse(node.next);
        //current tail to current node
        tail.next = node;

        // Moving tail pointer one by one, making current node the tail
        tail = node;

        //Making sure the previous head now points to null, so in every call we point current tail to null.
        tail.next = null;
    }

    //Iterative reversing of LinkedList (In Place)
    public void reverseList()
    {
        if(size < 2)
        {
            return;
        }
        Node prev = null;
        Node curr = head;
        Node next = head.next;

        /*
        while(next != null)
        {
            curr.next = prev;
            prev = curr;
            curr = next;
            head = curr;
            next = (next.next == null)? next.next : null;
        }
       */

        // Other way,
        while (curr != null)
        {
            curr.next = prev;
            prev = curr;
            curr = next;

            if(next != null)
            {
                next = next.next;
            }
            head = curr;
        }
    }

    //Reverse In Between
    public Node reverseBetween(Node head, int left, int right)
    {
        if(left == right)
        {
            return head;
        }

        //Skipping the (left - 1) Nodes
        Node current = head;
        Node previous = null;

        for (int i = 0; current != null && i < left - 1; i++) {
            previous = current;
            current = current.next;
        }

        Node last = previous;
        Node newEnd = current;
        Node next = current.next;
        //reverse between left and right
        for (int i = 0; i < right - left + 1; i++) {

            current.next = previous;
            previous = current;
            current = next;
            if(next != null)
            {
                next = next.next;
            }
        }

        if(last != null)
        {
            last.next = previous;
        } else {
            head = previous;
        }
        newEnd.next = current;

        return head;
    }



    public static void main(String[] args) {
//        CustomLinkedList list1 = new CustomLinkedList();
//        CustomLinkedList list2 = new CustomLinkedList();
//
//        list1.insertLast(1);
//        list1.insertLast(3);
//        list1.insertLast(5);

//        list2.insertLast(1);
//        list2.insertLast(2);
//        list2.insertLast(9);
//        list2.insertLast(14);

//        CustomLinkedList mergeList = mergeTwoLists(list1,list2);
//        mergeList.display();

        CustomLinkedList list = new CustomLinkedList();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertFirst(60);

        list.display();

        list.bubbleSort();

        list.display();

    }
}
