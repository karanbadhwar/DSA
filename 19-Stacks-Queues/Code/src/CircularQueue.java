public class CircularQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        data = new int[size];
    }

    public boolean isFull() {
        return size == data.length; // ptr is at the last Index
    }

    public boolean isEmpty() {
        return size == 0; // ptr is at the -1 index
    }
    //Inserting in the Circular Queue
    public boolean insert(int item)
    {
        if(isFull())
        {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    //Removing an item from the Queues
    public int remove() throws StackException
    {
        if(isEmpty())
        {
            throw new StackException("Cannot remove Item from an empty Queue!!");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    //Retrieving the First Item in the Queue.
    public int front() throws StackException
    {
        if(isEmpty())
        {
            throw new StackException("Queue is Empty!!");
        }

        return data[front];
    }


    //Displaying all the items in the Queue.
    public void display() throws StackException
    {
//        System.out.println(front);
//        System.out.println(end);
        if(isEmpty())
        {
            throw new StackException("Queue is Empty!!");
        }
        int i = front;
        do {
            System.out.print(data[i]+" <- ");
            i++;
            i %= data.length;
        } while(i != end);
        System.out.println("END");
    }

}
