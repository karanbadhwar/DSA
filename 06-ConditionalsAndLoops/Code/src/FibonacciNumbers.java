import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        //Q: Find the nth Fibonacci Number from series
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int prev = 0;
        int curr =  1;
        int count = 2;

        while(count <= n)
        {
            int temp = curr;
            curr = curr + prev;
            prev = temp;
            count++;
        }

        System.out.println(curr);


    }
}
