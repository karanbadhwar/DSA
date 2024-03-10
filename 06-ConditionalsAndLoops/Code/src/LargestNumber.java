import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();



       // Q: find the largest of the 3 numbers

        //Method 1
        //------------
//        int max = a;
//
//        if(b > max)
//            max = b;
//
//        if (c > max)
//            max = c;
//
//        System.out.println(max);

        //Method 2
        //------------

        int max = 0;

        if(a > b)
        {
            max = a;
        } else {
            max = b;
        }

        if(c > max)
        {
            max = c;
        }

        System.out.println(max);

//        int max = Math.max(c,Math.max(a,b));
    }
}
