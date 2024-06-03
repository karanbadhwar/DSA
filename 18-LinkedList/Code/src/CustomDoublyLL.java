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
