package Properties.Inheritance;

public class Box {
    private double l; // This is Data Hiding
    //    private double l; // Private variables can only be used in the current file and inside the class only
    double w;
    double h;

    /*
    Data Hiding -
        Data hiding is a principle of OOP that restricts direct access to some of an object's data and methods.
        This helps to protect the integrity of the object's state and prevents external code from depending on or altering internal implementation details.
     */

    double weight = 89.0d;

    //Initial Constructor
    Box() {
        System.out.println("Constructor 1");
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    //Cube
    Box(double side) {
        System.out.println("Constructor 2");
        this.l = side;
        this.w = side;
        this.h = side;
    }


    Box(double l, double w, double h) {
//        super(); // calling the constructor of Object class
        System.out.println("Constructor 3");
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box old) {
        System.out.println("Constructor 4");
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    //Getter
    public double getL() {
        return l;
    }

    //Setter
    public void setL(double l) {
        this.l = l;
    }

    static void greetings() {
        System.out.println("Hey, I am in Box Class!");
    }

    public void information() {
        System.out.println("Running the box");
    }
}
