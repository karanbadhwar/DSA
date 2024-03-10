import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = 1234454344;

        int count = 0;

        while(number > 0)
        {
            int rem = number % 10;

            if(rem == 4)
            {
                count++;
            }

            number = number /10;
        }

        System.out.println(count);
    }
}
