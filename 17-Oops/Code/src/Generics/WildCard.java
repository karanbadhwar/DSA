package Generics;

import java.util.Arrays;

//Upper Bound Wildcard -> this restricts the Generic Type Parameter to only Number class, or it's Subclass such as Integer ...
public class WildCard<T extends Number> {

    private Object[] data;

    private int size = 0;

    private static int DEFAULT_SIZE = 10;

    public WildCard() {
//        this.data = new T[DEFAULT_SIZE]; //Cannot create instances of Type Parameter
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }

        //Adding the Item into the array list and increasing the size by 1
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

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
    public T remove() {
        T removed = (T) (data[--size]);
        return removed;
    }

    //Getting the item at particular index
    public T get(int index) {
        return (T) (data[index]);
    }

    //Getting the size of the array i.e., data in this case
    public int size() {
        return size;
    }

    //Setting the value at a particular index
    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        // As list2 did not mention type for the ref, we can add anything which is not safe
//        ArrayList list2 = new ArrayList();
//        list2.add(233); //Can do
//        list2.add("sdsad"); //Can do

//        CustomGenericArrayList list = new CustomGenericArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);
//
//        System.out.println(list);


        WildCard<Integer> list = new WildCard<>();
        list.add(4);
        list.add(3);
        list.add(5);
//        list.add("sadas"); //Error

        System.out.println(list);

//        WildCard<String> list2 = new WildCard<String>(); Not in the Bound

//        ArrayList<Number> listNum = new ArrayList<>();
//
//        listNum.add(4);
//        listNum.add(45.33);

    }
}
