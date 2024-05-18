package StaticExample;

public class Human {
    //Class related Property i.e., Static property
    static long population;

    //Instance Properties
    String name;
    int age;
    int salary;
    boolean married;

    public Human(String name, int age, int salary, boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        //That's how static variables should be declared, if value being changed after an object being constructed
        Human.population += 1;
        //Below one also works,as in this case "this" will refer to Class Name, as it is static
//        this.population += 1;
    }

    //We can create both properties and methods as Static

    static void greet()
    {
        System.out.println("Kaise hai app");
    }
}
