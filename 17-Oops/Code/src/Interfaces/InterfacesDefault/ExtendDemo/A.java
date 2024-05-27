package Interfaces.InterfacesDefault.ExtendDemo;

public interface A {

    //Static Interface methods should always have body
    static void greetings() {
        System.out.println("Greetings from static interface method");
    }


    default void fun() {
        System.out.println("I am in A");
    }
}
