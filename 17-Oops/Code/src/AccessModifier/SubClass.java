package AccessModifier;

public class SubClass extends TryOut {
    public SubClass(int a, int b, int c, int d) {
        super(a, b, c, d);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(10, 20, 30, 40);

//        obj.a; //Private -> Cannot Access
        int publicVariable = obj.b;
        int protectedVariable = obj.c;
        int defaultVariable = obj.d;

    }
}
