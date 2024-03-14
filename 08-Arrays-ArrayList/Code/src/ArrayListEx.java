import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ArrayList
        /*
            Syntax
            ArrayList<DataType> variable_Name = new ArrayList<DataType>(initialCapacity);
            //Mentioning Datatype at the last Generics bracket is not mandatory
            //initialCapacity is default to 10
            //DataType can only be an Object or Wrapper classes
         */
    ArrayList<Integer> list = new ArrayList<>(10);

//    list.add(10);
//    list.add(67);
//    list.add(69);
//    list.add(648);
//    list.add(165);
//    list.add(263);
//    list.add(263);

//    System.out.println(list);
//
//    list.set(0,99);
//
//    list.removeLast();
//
//    System.out.println(list);

    //Inputting using for loop
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

    //Outputting using for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //list[index] won't work here
        }

    }
}
