import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        calculateSum();

        int ans = calculateSum_ReturnType();

        System.out.println("Answer: "+ans);

    }

    //Returning from function over here return type is INT
    static int calculateSum_ReturnType()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        return sum;
    }

    //Return type VOID
    static void calculateSum()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("The Sum: "+ sum);
    }
}
