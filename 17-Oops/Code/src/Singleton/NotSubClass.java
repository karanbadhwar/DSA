package Singleton;

import AccessModifier.TryOut;

public class NotSubClass {


    public static void main(String[] args) {
        TryOut tO = new TryOut(20, 30, 40);

        int publicVariable = tO.b;
//        int defaultVariable = tO.d; default -> not in same package

//        int protectedVariable = tO.c; // Protected -> can only be accessed even by its own class's Object,
//          if it's object is inside the same package, where it's class is defined or we can access,
//          via its subclass of the class defining the protected variable

    }
}
