package Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println("Polymorphism");
        /*
            Polymorphism - many ways to represent a single Entity
                Poly -> Many,
                Morphism -> ways to represent

                Types of Polymorphism
                1 - Compile Time Polymorphism (Static) -> Method Overloading
                2 - Run Time Polymorphism (Dynamic) -> Method Overriding
         */

        /*
            THE REFERENCE, DEFINES WHAT IT IS ABLE TO ACCESS & WHICH ONE IT IS ABLE TO ACCESS IS DEFINED BY THE OBJECT
         */

        /*
            Final Classes cannot be Extended and Final Methods cannot be Overrrided
         */

        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        //Over here it is running the method inside the Object not the reference
        Shapes sq = new Square();

        sq.area();
    }
}
