package Properties.Inheritance;

public class Box {
    private double l;
    //    private double l; // Private variables can only be used in the current file and inside the class only
    double w;
    double h;

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

    public void information() {
        System.out.println("Running the box");
    }
}
