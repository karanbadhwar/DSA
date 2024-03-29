import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BS2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        ArrayList<ArrayList<Integer>> Alist = new ArrayList<>();
        Alist.add(new ArrayList<>(List.of(10,20,30,40)));
        Alist.add(new ArrayList<>(List.of(15,25,35,45)));
        Alist.add(new ArrayList<>(List.of(28,29,37,49)));
        Alist.add(new ArrayList<>(List.of(33,34,38,50)));
        int target = 37;
        int tWithAL = 49;

        System.out.println(Arrays.toString(search_Arraylist(Alist, tWithAL)));
//        System.out.println(Arrays.toString(search(matrix, target)));
    }

    //With ArrayLists
    static int[] search_Arraylist(ArrayList<ArrayList<Integer>> matrix, int target)
    {
        int row = 0;
        int col = matrix.size() - 1;

        while(row < matrix.size() && col >= 0)
        {
            if(matrix.get(row).get(col) == target)
            {
                return new int[]{row, col};
            }

            if(matrix.get(row).get(col) < target)
            {
                row++;
            } else {
                col--;
            }
        }

        //If Item not found
        return new int[]{-1,-1};

    }

    //With Arrays
    static int[] search(int[][] matrix, int target)
    {
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0)
        {
            //Case 1
            if(matrix[row][col] == target)
            {
                return new int[]{row,col};
            }

            // Case 2
            if(matrix[row][col] > target)
            {
                col--;
            }

            // Case 3
            if(matrix[row][col] < target)
            {
                row++;
            }

        }

        // If Target not found
        return new int[]{-1,-1};
    }
}
