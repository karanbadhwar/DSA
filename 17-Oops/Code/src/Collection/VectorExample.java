package Collection;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Integer> list = new Vector<>();

        list.add(45);
        list.add(15);
        list.add(5);
        list.add(55);

        System.out.println(list);
    }
}
