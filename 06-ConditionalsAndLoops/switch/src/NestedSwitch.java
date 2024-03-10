import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int employeeID = sc.nextInt();
        String dept = sc.next();

        //Note - With Enhanced switch every case had a break;

        switch (employeeID) {
            case 1 -> System.out.println("Karan Badhwar");
            case 2 -> System.out.println("Karan Karan");
            case 3 -> {
                System.out.println("Employee Number 3");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department Entered");
                }
            }
            default -> System.out.println("Enter correct Employee ID");
        }

    }
}
