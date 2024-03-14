public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};

        for(int x: arr)
            System.out.print(x+" ");

        swap(arr, 1, 3);
        System.out.println();

        for(int x: arr)
            System.out.print(x+" ");
    }

    static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
