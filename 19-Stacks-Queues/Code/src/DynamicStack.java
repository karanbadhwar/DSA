public class DynamicStack<E> extends CustomStack<E> {

    //This Stack will never be full, as we will be increasing the size of the stack.


    public DynamicStack() {
        super(); // It will call CustomStack()
    }

    public DynamicStack(int size) {
        super(size);// It will call CustomStack(size)
    }

    @Override
    public boolean push(E item) throws StackException {
        //This only happens when the stack is full, followed by the Insertion
        if(isFull())
        {
            //double the array size
            E[] temp = (E[]) new Object[this.data.length * 2];

            //Copy all previous items into a new array and re-assigning.
            for (int i = 0; i < this.data.length; i++) {
                temp[i] = data[i];
            }
            this.data = temp;
        }

        //At this point, we know an array is not full.
        //Insert Item
        return super.push(item);

    }
}
