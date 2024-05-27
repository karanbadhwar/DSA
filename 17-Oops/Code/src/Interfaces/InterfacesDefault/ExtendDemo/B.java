package Interfaces.InterfacesDefault.ExtendDemo;

public interface B {
//    void fun();

    default void greet() {
        System.out.println("Greetings from Interface B");
    }
}
