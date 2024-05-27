package Interfaces.Nested;

public class A {
    //Nested Interface
    public interface nestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.nestedInterface {

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1; // Bitwise Operator part
    }
}
