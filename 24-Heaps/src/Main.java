import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Heaps");

        Heap<Integer> heap = new Heap<>();

        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);

//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());

//        ArrayList<Integer> list = heap.heapSort();
//        System.out.println(list);

        System.out.println(Arrays.toString(heap.heapFromArray(new int[]{3, 6, 22, 1, 78, 99})));
    }
}
