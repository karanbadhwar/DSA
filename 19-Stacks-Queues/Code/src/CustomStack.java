public class CustomStack<E> {
    protected E[]  data;

    private static final int DEFAULT_SIZE = 10;

    //Pointer to keep increasing on every new element added.
    private int ptr = -1;

    public CustomStack() {
        //Brief - If passed a value like this to "This" it will point to the other constructor.
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
       this.data = (E[])new Object[size];
    }

    //Adding the push method to adding the elements inside the stack.
    public boolean push(E item) throws StackException
    {
        //Checking if th Stack is Full.
        if(isFull())
        {
            throw new StackException("Stack is Full!!");
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    //Adding the pop method to remove the Head(Top) element from the stack.
    public E pop() throws StackException {
        //Checking if the Stack is Empty.
        if(isEmpty())
        {
            throw new StackException("Cannot pop from an Empty Stack");
        }


        E removed = data[ptr];
        ptr--;
        return removed;
        //return data[ptr--]; // Simple Way
    }

    //Adding the Peek Method to retrieve the element at the top/head.
    public E peek() throws StackException
    {
        if(isEmpty())
        {
            throw new StackException("cannot peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length -1; // ptr is at the last Index
    }

    public boolean isEmpty() {
        return ptr == -1; // ptr is at the -1 index
    }

}
