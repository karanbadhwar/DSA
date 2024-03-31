import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,30,40},
                {50,60,70,85},
                {98,109,137,149},
                {233,234,238,250}
        };
        int target = 234;
        System.out.println(Arrays.toString(search(matrix, target)));
    }

    //Search in the row provided between columns provided
    static int[] binarySearch(int[][] matrix, int target, int row, int cStart, int cEnd)
    {
        while(cStart <= cEnd)
        {
            int mid = cStart + (cEnd - cStart) /2;
            if(matrix[row][mid] == target)
            {
                return new int[]{row, mid};
            }

            if(matrix[row][mid] < target)
            {
                cStart++;
            } else{
                cEnd--;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(rows == 1)
        {
            return binarySearch(matrix,target, 0, 0, cols-1);
        }

        int rowStart = 0;
        int rowEnd = rows -1;
        int colMid = cols /2;

        //Running the loop till 2 rows are remaining
        while(rowStart < (rowEnd - 1))
        {
            int midRow = rowStart + (rowEnd - rowStart) /2;

            if(matrix[midRow][colMid] == target)
            {
                return new int[]{midRow, colMid};
            }

            if(matrix[midRow][colMid] < target)
            {
                rowStart = midRow;
            } else {
                rowEnd = midRow;
            }
        }

        //Left with 2 rows
        //Check if the middle Cols of 2 rows has the answer
        if(matrix[rowStart][colMid] == target)
        {
            return new int[]{rowStart, colMid};
        }
        if(matrix[rowEnd][colMid] == target)
        {
            return new int[]{rowEnd, colMid};
        }

        //Search in 1st half
        if(target <= matrix[rowStart][colMid - 1])
        {
            return binarySearch(matrix,target,rowStart, 0, colMid - 1);
        }

        //Search in 2nd half
        if(target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][matrix[rowStart].length - 1])
        {
            return binarySearch(matrix,target,rowStart, colMid + 1, matrix[rowStart].length - 1);
        }

        //Search in 3rd half
        if(target <= matrix[rowEnd][colMid - 1])
        {
            return binarySearch(matrix,target,rowEnd, 0, colMid - 1);
        }

        //Search in 4th half
        if(target >= matrix[rowEnd][colMid + 1])
        {
            return binarySearch(matrix,target,rowEnd, colMid + 1, matrix[rowEnd].length - 1);
        }


        return new int[]{-1,-1};

    }
}
