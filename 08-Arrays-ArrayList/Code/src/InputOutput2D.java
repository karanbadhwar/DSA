import java.util.Arrays;
import java.util.Scanner;

public class InputOutput2D {
    public static void main(String[] args) {
        //Inputting into 2D Array

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println(arr.length); // Number of rows

        //Input
        //For loop for Each Row
        for(int row =0 ; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //Output
//        for(int row =0 ; row < arr.length; row++)
//        {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for(int row =0 ; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }

        //Enhanced for loop
        for(int[] x: arr)
        {
            for(int col = 0; col < x.length; col++)
            {
                System.out.print(x[col]+ " ");
            }
            System.out.println();
        }



    }
}
