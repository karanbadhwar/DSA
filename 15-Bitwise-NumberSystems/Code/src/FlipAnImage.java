import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/
public class FlipAnImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

        flipAndInvertImage(image);

        for (int[] arr: image)
        {
            System.out.println(Arrays.toString(arr));
        }

    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] row: image)
        {
            //Reversing the arrays
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                //swap
                int temp = row[i] ^ 1;
                row[i] = row[row.length - i - 1] ^ 1;
                row[row.length - i - 1] = temp;
            }
        }
        return image;
    }
}


//My solution for sorting
//----------------------------------------------------------
//        for (int row = 0; row < image.length; row++) {
//int start= 0;
//int end = image[row].length -1;
//
//            while (start <= end)
//        {
//int temp = image[row][start];
//image[row][start] = image[row][end];
//image[row][end] = temp;
//start ++;
//end--;
//        }
//        }
//        return new int[][] {{-1,-1}};