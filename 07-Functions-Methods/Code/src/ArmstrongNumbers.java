import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Provide a Number");
        int n = in.nextInt();

        System.out.println("Number is Armstrong: "+isArmstrong(n));
    }

    static boolean isArmstrong(int n)
    {
        int original = n;
        int count = 0;
        int counter = n;

        int sum = 0;
        while(counter > 0)
        {
            count++;
            counter /= 10;
        }

        System.out.println(count);

        while(original > 0)
        {
            int rem = original % 10;
            sum += multiplier(rem,count);
            original = original / 10;
        }

        return sum == n;
    }

    static int multiplier(int num, int counter)
    {
        int i = 0;
        int mul= 1;
        while(i < counter)
        {
            mul *= num ;
            i++;
        }
        return mul;
    }
}
