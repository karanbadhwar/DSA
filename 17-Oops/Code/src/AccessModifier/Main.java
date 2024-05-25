package AccessModifier;

public class Main {
    public static void main(String[] args) {
        /*
            Not Conventional to have class members being able to use directly, they should
            be protected from outer direct usage.
         */

        /*
            Access Modifiers: -
            1 - Private - Member can only be accessed inside the Class!
            2 - Default - If no access modifier is present, it is default then!
                          Default can only be accessed inside the Package/Directory.
            3 - Public - Can be accessed anywhere.
            4 - Protected - Only Subclass can access the member in diff package,
                            other than that in the same package it can be accessed via subclass's object or its own class's object
         */

        TryOut trying = new TryOut(20, 30, 40);
    }
}
