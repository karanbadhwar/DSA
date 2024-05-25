package Abstract;

public class Son extends Parent {

    public Son(int age) {
        super(age);

    }

    @Override
    void career(String name) {
        System.out.println("Son is going to be a " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I love " + name + ". She is " + age);
    }
}
