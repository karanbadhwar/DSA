public class SortedMatrix {
    public static void main(String[] args) {

    }

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

    }
}
