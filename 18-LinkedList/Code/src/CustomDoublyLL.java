public class CustomDoublyLL {

    private Node head;

    //Inserting First Element
    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head; // If Head Empty, node.next will point to null i.e., only node presents.
        node.previous = null; // First Node

        if(head != null) // If any Item is already present, this will make previous of old head pointing to current head.
        {
            head.previous = node;
        }
        head = node;
    }

    //Inserting Last Element
    public void insertLast(int val)
    {
        //both node and temp variable will be sent to garbage collection, only Node Object will stay in the memory.
        Node node = new Node(val); // Creating the Node that is going to be Inserted.

        //If the list is empty.
        if(head == null)
        {
//            node.previous = null; // Not Necessary as it gets initialized at the object creation.
            head = node;
            return;
        }

        Node temp = head;

        while(temp.next != null) // This made sure we are at the last not at the point where the value is null
        {
            temp = temp.next;
        }

        temp.next = node; // Assigning the Tail's Next to the new Last(Tail).
        node.previous = temp; // Connecting the previous Tail to the new Tail.

    }

    //Inserting an Element at given Index
    public void insert(int val, int after)
    {
        Node prev = find(after);

        if(prev == null)
        {
            System.out.println("Does not Exist");
            return;
        }

        Node node = new Node(val); // Creating the Node that is going to be Inserted.
        node.next = prev.next;
        prev.next = node;
        node.previous = prev;

        if(node.next != null) { // It can cause null pointer Exception, that's why we have a check.
            node.next.previous = node;
        }
    }

    private Node find(int after) {
        Node node = head;
        while(node.next != null)
        {
            if (node.value == after)
            {
                return node;
            }
            node = node.next;
        }
        return null; // If nothing found
    }

    //Displaying the complete list
    public void display()
    {
        Node temp = head;
        Node last = null;
        while(temp != null)
        {
            System.out.print(temp.value+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        //Printing in Reverse
        while(last != null)
        {
            System.out.print(last.value+" -> ");
            last = last.previous;
        }
        System.out.println("END");
    }


    private class Node{
        private int value;
        private Node next; // By default, it is Null
        private Node previous;

        public Node(int value) {
            this.value = value;
        }


        public Node(Node next, Node previous, int value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }
    }
}
