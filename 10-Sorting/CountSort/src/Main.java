import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Count Sort");
        int[] arr = {3,4,7,8,2,4,1};
        countSortHash(arr);
        System.out.println(Arrays.toString(arr));
    }

    //With HashMaps
    public static void countSortHash(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        //Finding Max out of the list
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        // Storing Frequency in Map
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int num: arr) {
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }

        //Sorting
        int index = 0;
        for (int i = min; i <= max; i++) {
            int count = countMap.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;
            }
        }

    }

    //Without HashMaps
    public static void countSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        //Finding Max out of the list
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        //Frequency Array
        int[] countArray = new int[max + 1];

        for (int num : arr) {
            countArray[num]++;
        }

        //Sorting
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i] > 0) {
                arr[index] = i;
                countArray[i]--;
                index++;
            }
        }
    }
}