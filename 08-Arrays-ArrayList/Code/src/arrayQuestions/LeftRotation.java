package arrayQuestions;

import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/array-left-rotation/problem

public class LeftRotation {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
//        List<Integer> integers = rotateLeft(2, list);
        List<Integer> integers = rotateLeftReverse(2, list);
        System.out.println(integers);
    }

    // Brute Force
//    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
//
//        for (int i = 0; i < d; i++) {
//            int temp = arr.get(0);;
//            for (int j = 0; j < arr.size()-1; j++) {
//                arr.set(j,arr.get(j+1));
//            }
//            arr.set(arr.size()-1, temp);
//        }
//
//        return arr;
//    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> newList  = new ArrayList<>();

        for (int i = d; i < arr.size(); i++) {
            newList.add(arr.get(i));
        }

        for (int i = 0; i < d; i++) {
            newList.add(arr.get(i));
        }
        return newList;
    }

    // Reversing Method
    public static List<Integer> rotateLeftReverse(int d, List<Integer> arr) {
        d = d %arr.size();

        // Reversing all the elements
        reverse(arr,0,arr.size()-1);

        // Reversing elements from start to arr.size() - d
        reverse(arr, 0,arr.size() - d - 1);

        // Reversing elements from arr.size() - d to end
        reverse(arr, arr.size() - d, arr.size() - 1);

        return arr;
    }

    private static void reverse(List<Integer> arr, int start, int end) {
        while(start  < end){
//            arr.set(start,arr.get(start) ^ arr.get(end));
//            arr.set(end, arr.get(start) ^ arr.get(end));
//            arr.set(start,arr.get(start) ^ arr.get(end));
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }

}
