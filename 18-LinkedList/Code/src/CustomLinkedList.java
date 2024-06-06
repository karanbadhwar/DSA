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
}
