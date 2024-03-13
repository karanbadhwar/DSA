public class Scope {
    public static void main(String[] args) {
        //Scope-Where we can access out Variables!!

        /*
        Scopes:-
        1 - Function Scope
        2 - Block Scope
        3 - Loop scope
         */

        int a = 10;
        int b = 20;

        {
//            int a = 78; // Block is inside Main() scope, a is already initialised in main method
            a= 100; // Works, re-assigning the original ref
            int c = 90; // Works

        }

//        System.out.println(c); // c is in block scope cannot be accessed out of it

        {
            int c = 100; //Works
        }

        int c = 900; // works - As it is initialised after block scoped C Variable

        //Scoping in loop
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
//            int a = 334; //loop is inside Main() scope, a is already initialised in main method
        }

//        System.out.println(i); //Cannot Access it
    }

    static void random(int marks)
    {
        int num = 47;
        System.out.println(num);
        System.out.println(marks);
    }
}
