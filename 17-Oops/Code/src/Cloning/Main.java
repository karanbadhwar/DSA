package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human karan = new Human(29, "Karan");
//        Human twin = new Human(karan);

//        Cloning is but faster if we have to copy huge data.
        //Moreover, it does a shallow copy of the Object.
        // Cloning
        Human clone = (Human) karan.clone();
//
//        System.out.println(karan.equals(clone));
//
        System.out.println(clone.age + " " + clone.name);
        System.out.println(Arrays.toString(clone.arr));
//
        clone.arr[0] = 100;
//
        System.out.println(Arrays.toString(karan.arr));
        System.out.println(Arrays.toString(clone.arr));

//        System.out.println(clone.name == karan.name); // Pointing to the same object in String pool

//        clone.name = "KB";
//        System.out.println(clone.name == karan.name); // Now changed it wont point to same object


//        clone.name = "kb";

//        System.out.println(karan.name);

        /*
            It will do shallow copy, means will get its own copy of primitives & non-primitives,
            but as, it copies array as well (Shallow) it copies the address. So any change will effect the original array.
         */


    }
}
