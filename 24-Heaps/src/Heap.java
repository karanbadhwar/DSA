import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }

    //When Rearranging the Nodes / Elements in the Array
    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    // Getting the parent of an Element / Node
    private int parent(int index) {
        return (index - 1) / 2;
    }

    // Getting the Left of the Given Index
    private int left(int index) {
        return index * 2 + 1;
    }

    // Getting the right of the given Index
    private int right(int index) {
        return index * 2 + 2;
    }

    //Inserting an Element
    public void insert(T value) {
        list.add(value);
        upHeap(list.size() - 1);
    }

    private void upHeap(int index) {
        if(index == 0) {
            return;
        }
        int parentIndex = parent(index);

        if(list.get(index).compareTo(list.get(parentIndex)) < 0) {
            swap(index, parentIndex);
            upHeap(parentIndex);
        }
    }

    public T remove() throws Exception {
        if(list.isEmpty()) {
            throw new Exception("Removing from an empty heap!");
        }

        T temp = list.getFirst();

        T last = list.removeLast();

        if(!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }

    private void downHeap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }

        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if(min != index) {
            swap(min, index);
            downHeap(min);
        }
    }

    //HeapSort
    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();

        while(!list.isEmpty()) {
            data.add(this.remove());
        }

        return data;
    }

    public int[] heapFromArray(int[] arr) throws Exception {

        for (int i = arr.length / 2; i >= 0 ; i--) {
            downHeapArray(i, arr);
        }

        return arr;
    }

    public void downHeapArray(int index, int[] arr) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left < arr.length && arr[min] > arr[left]) {
            min = left;
        }

        if(right < arr.length && arr[min] > arr[right]) {
            min = right;
        }

        if(min != index) {
            swapFromArray(arr,min, index);
            downHeapArray(min, arr);
        }

    }

    private void swapFromArray(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

    }
}