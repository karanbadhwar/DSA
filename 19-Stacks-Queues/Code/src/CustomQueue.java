public class CustomQueue {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        data = new int[size];
    }

    public boolean isFull() {
        return end == data.length; // ptr is at the last Index
    }

    public boolean isEmpty() {
        return end == 0; // ptr is at the -1 index
    }

    //Inserting in the Queue
    public boolean insert(int item)
    {
        if(isFull())
        {
            return false;
        }
        data[end++] = item;
        return true;
    }

    //Removing an item from the Queues
    public int remove() throws StackException
    {
        if(isEmpty())
        {
            throw new StackException("Cannot remove Item from an empty Queue!!");
        }
        int removed = data[0];

        //Shifting the elements to the left.
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    //Retrieving the First Item in the Queue.
    public int front() throws StackException
    {
        if(isEmpty())
        {
            throw new StackException("Queue is Empty!!");
        }

        return data[0];
    }

    //Displaying all the items in the Queue.
    public void display()
    {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

}
