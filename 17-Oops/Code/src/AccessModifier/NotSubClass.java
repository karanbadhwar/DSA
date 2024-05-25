package AccessModifier;

public class NotSubClass {


    public static void main(String[] args) {
        TryOut tO = new TryOut(20, 30, 40);

//        int privateVariable =  obj.a; // private -> cannot
        int publicVariable = tO.b;
        int protectedVariable = tO.c;
        int defaultVariable = tO.d;

    }
}
