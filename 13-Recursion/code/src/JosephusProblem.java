//https://www.geeksforgeeks.org/problems/game-of-death-in-a-circle1840/1

import org.w3c.dom.ranges.Range;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class JosephusProblem {
    public static void main(String[] args) {
        safePos(40, 7);
    }

    public static int safePos(int n, int k) {
        if (n <= 1){
            return 1;
        }
        ArrayList<Integer> people =
                new ArrayList<>(IntStream.rangeClosed(1,n).boxed().toList());
        solve(people, k-1, 0);
        return people.getFirst();
    }

    public static void solve(ArrayList<Integer> arr, int k, int currentIndex){
        if (arr.size() == 1){
            System.out.println(arr);
            return;
        }

        // Removed Person
        int removedIndex = (currentIndex + k) % arr.size();
        arr.remove(removedIndex);

        // Hypothesis
        solve(arr, k, removedIndex);
    }
}
