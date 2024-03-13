public class Shadowing {
    static int x = 90;//This will be shadowed at line 8, shadowing works for class Variable
    public static void main(String[] args) {
        //Shadowing
        /*
         in Java is the practice of using variables in overlapping scopes with the same name
         where the variable in low-level scope overrides the variable of high-level scope.
         */
        //______________
        System.out.println(x); //90

        int x = 40; //Shadowing done for this block

        //OR
//        int x;
//        x = 40; //Scope will begin when value is initialized
        System.out.println(x);//40
        fun();

    }

    static void fun()
    {
        System.out.println(x);
    }
}
