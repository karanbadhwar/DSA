package Singleton;

public class Main {
    public static void main(String[] args) {
//        Singleton single = new Singleton();
        //All objs are pointing to the same Object
        Singleton single = Singleton.getInstance();
        Singleton second = Singleton.getInstance();
        Singleton third = Singleton.getInstance();
    }
}
