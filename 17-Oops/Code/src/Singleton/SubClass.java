package Singleton;

import AccessModifier.TryOut;

public class SubClass extends TryOut {
    public SubClass(int b, int c, int d) {
        super(b, c, d);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(20, 30, 40);

//        obj.a; //Private -> Cannot Access
        int publicVariable = obj.b;
        int protectedVariable = obj.c;
//        int defaultVariable = obj.d; // Default -> Cannot Access

    }
}
