package Abstract;

//An Abstract class cannot be FINAL!!
public abstract class Parent {

    int age;

    final int VALUE;

    public Parent(int age) {
        this.age = age;
        this.VALUE = 33455;
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
