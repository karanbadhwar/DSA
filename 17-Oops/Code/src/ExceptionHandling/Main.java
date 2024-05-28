package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        /*
         * Exception Handling -> Saving the program from it's flow getting prevented by Exception.
         * Throwable Class is the parent class of all Exceptions Inheriting from Object class
         */

        int a = 5;
        int b = 0;

        try {
//            divide(a, b);

            //Trying out
            String name = "Karan";

            if (name.equals("Karan")) {
                throw new MyException("Name is Karan");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Normal Exception");
        } finally {
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }

        return a / b;
    }
}
