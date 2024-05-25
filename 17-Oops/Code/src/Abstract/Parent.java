package Abstract;

abstract public class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void hello() {
        System.out.println("How you doin!!");
    }

    void greetings() {
        System.out.println("To Kaisen hain aap!");
    }


    abstract void career(String name);

    abstract void partner(String name, int age);
}
