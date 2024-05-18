package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human Karan = new Human("Karan", 29, 100000, false);
        Human Raauul = new Human("Raaul", 30, 150000, true);

        /*
        We can access static variables, with reference name as well, but the convention is
        to use it via Class name, as if it is not available inside the Object it will automatically search
        from its Template, which is class
         */

//        System.out.println(Karan.population); // Not Ideal
//        System.out.println(Human.population);
    }

    //This is not dependent on Objects, as it's value or functionality is Class-Dependent
    static void fun()
    {
        System.out.println("Fun");
        //Static methods can only accept static data
//        greeting(); // to be used, this function required an Instance
        //As Non-static member belongs to an Instance, Moreover, we cannot have any non-static member inside
        // the static member, as we are not sure whose(Instance) dependent member we are accessing

        //To make it work, we can do something like
        //By referencing to the associated Object
        Main obj = new Main();
        obj.greeting();
    }

    //It is dependent on Objects, as it's value or functionality can be dependent on the value passed by Instance
    void greeting() {
//        fun(); // can access Static Members
        System.out.println("Hello world");
    }

    //We cannot access non-static member, without explicitly mentioning anObject reference to it!
}
