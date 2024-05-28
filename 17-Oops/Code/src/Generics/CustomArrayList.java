package Generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;

    private int size = 0;

    private static int DEFAULT_SIZE = 10;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }

        //Adding the Item into the array list and increasing the size by 1
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        //Copying the array items into the new array

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        //Changing the previous array to a newly created array
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    //Removing the data and decreasing the size by 1
    public int remove() {
        int removed = data[--size];
        return removed;
    }

    //Getting the item at particular index
    public int get(int index) {
        return data[index];
    }

    //Getting the size of the array i.e. data in this case
    public int size() {
        return size;
    }

    //Setting the value at a particular index
    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(9);

        System.out.println(list);
    }
}
