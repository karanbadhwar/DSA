import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
        int m = scan.nextInt();
        int j = scan.nextInt();
        //Q: print numbers from 1 to 5

//        int i = 1;
        int k = 1;
        int l = 1;


        //For Loop
//        for(; i <=5; i++)
//        {
//            System.out.println("For Loop "+i);
//        }


        //While Loop
        while(k <= m)
        {
            System.out.println("While Loop "+k);
            k++;
        }

        //do-while loop
        do {
            System.out.println("Do-While Loop "+l);
            l++;
        }while(l <= j);
    }
}
