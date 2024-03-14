import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Arrays of Primitive type
        /*
        int[] arr = new int[5];



        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }

        //Iterating over Array

        //1 - For Loop
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        //2 - For-Each Loop
        for(int x: arr)
        {
            System.out.println("Using For-Each Loop "+x);
        }

        //3 - Using Arrays utility class
        System.out.println("Using Arrays Utlity Class "+ Arrays.toString(arr));
    */

        //Arrays of Objects like String
        String[] str = new String[4];
        for(int i = 0; i < str.length; i++)
        {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));


    }
}
