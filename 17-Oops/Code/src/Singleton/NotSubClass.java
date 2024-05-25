package Singleton;

import AccessModifier.TryOut;

public class NotSubClass {


    public static void main(String[] args) {
        TryOut tO = new TryOut(10, 20, 30, 40);

        int publicVariable = tO.b;

//        int protectedVariable = tO.c; // Protected -> needs at least to be a subclass

    }
}
