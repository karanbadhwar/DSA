import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Take input from user till user does not press X or x
        while(true)
        {
            System.out.println("Please provide the functionality you want the calculator to perform");
            char op = scan.next().trim().charAt(0);



            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
            {
                System.out.println("Please provide both the values with space");
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();
                if(op == '+')
                {
                    System.out.println(num1+num2);
                } else if(op == '-')
                {
                    System.out.println(num1-num2);
                }else if(op == '*')
                {
                    System.out.println(num1*num2);
                } else if(op == '/' && num2 != 0)
                {
                    System.out.println(num1/num2);
                } else
                {
                    System.out.println(num1%num2);
                }

            } else if (op == 'X' || op == 'x'){
                System.out.println("Calculator Shut Down");
                break;
            }
            else {
                System.out.println("Invalid Operation");
            }


        }
    }

}
