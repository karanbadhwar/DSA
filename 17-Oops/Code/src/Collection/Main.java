package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
            Collection Framework:
             * It is a Framework, Collection of Files / Code to reuse it.
             * In Java.util.....;
         */

//        Collection
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(23);
        list2.add(33);
        list2.add(55);
        list2.add(67);

        System.out.println(list2);

        
    }
}
