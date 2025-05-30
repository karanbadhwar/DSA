package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAnArrayWithRecur {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(0,1,5,2));
        sortByRecur(arr);
        System.out.println(arr);
    }

    private static void sortByRecur(ArrayList<Integer> arr) {
        // Base Condition
        if (arr.size() <= 1 ){
            return;
        }

        int temp = arr.removeLast();
        // Hypothesis
        sortByRecur(arr);

        // Induction
        insertByRecur(arr, temp);
    }

    private static void insertByRecur(ArrayList<Integer> arr, int temp) {
        // Base Condition
        if (arr.isEmpty() || arr.getLast() <= temp) {
            arr.add(temp);
            return;
        }

        int val = arr.removeLast();
        // Hypothesis
        insertByRecur(arr, temp);
        arr.add(val);
    }
}
