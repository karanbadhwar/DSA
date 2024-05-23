package Properties.Polymorphism;

public class Shapes {
    // We cannot override a method which is FINAL
    void area() {
        System.out.println("I am in Shapes");
    }

    void sum(int a, float b) {
        float total = a + b;
    }

    void sum(float b, int a) {
        float total = a + b;
    }
}
