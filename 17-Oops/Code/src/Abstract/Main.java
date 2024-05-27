package Abstract;

public class Main {
    public static void main(String[] args) {
        /*
            Abstract Method -> Abstract Method means provide the name and signature of the method,
                while its implementation is created inside the Subclass!!

            If a class contains 1 or more than one abstract method, it should also be declared as abstract.
            Abstract classes cannot have Objects.

            We cannot have Static Abstract Methods, as Static methods cannot be overridden.
         */

        /*
            Abstract Method ->
                abstract returnType MethodName(Parameters);
         */

        Son son = new Son(22);
        son.career("Doctor");
        son.greetings();

        Daughter daughter = new Daughter(23);
        daughter.career("Nurse");

//        Parent parent = new Parent(); Cannot create object of Abstract class

        //Can use the Abstract class as a variable Reference
        Parent daughter2 = new Daughter(23);

        Parent.hello();

    }
}
