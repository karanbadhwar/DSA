public class DynamicQueue extends CircularQueue{
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item){
        if(this.isFull())
        {
            //Doubling the size of the array
            int[] temp = new int[this.data.length * 2];

            //Copying all the data.
            for (int i = 0; i < this.data.length; i++) {
                temp[i] = data[(this.front + i) % data.length];
            }

            this.front = 0;
            this.end = data.length;

            //Changing the reference variable to a doubled sized array.
            data = temp;
        }


        return super.insert(item);
    }
}
