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
    public void insert(int val, int index)
    {

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
}
