public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    //Inserting at First only if list(Head) is empty otherwise will keep adding element at the end.
    public void insert(int value)
    {
        Node node = new Node(value);

        if(head == null)
        {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    //Deleting an element of provided value.
    public void delete(int value)
    {
        if(head == null)
        {
            return;
        }

        Node temp = head;

        if(temp.value == value)
        {
            head = head.next;
            tail.next = head;
            return;
        }


        do {
        Node node = temp.next;
        if(node.value == value)
        {
            temp.next = node.next;
            break;
        }
        temp = temp.next;
        } while(temp != head);

    }
// Displaying all the Elements.
    public void display()
    {
        Node temp = head;
        if(head != null)
        {
            do {
                System.out.print(temp.value+" -> ");
                temp=temp.next;
            } while(temp != head);
            System.out.println("HEAD");
        }
    }

    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
