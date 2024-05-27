package Interfaces.InterfacesDefault.ExtendDemo;

public class Main implements B, A {
//    @Override
//    public void fun() {
//
//    }

    /*private will not work */
    public void greet() {
        System.out.println("greetings from Main");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.fun();
        main.greet();

        //Static method should be called via the interface name
        A.greetings();
    }

}
