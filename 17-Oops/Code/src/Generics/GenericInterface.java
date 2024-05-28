package Generics;

public interface GenericInterface<T> {
    void fun();

    void greet();

    void display(T value);
}

//class Random{
//    public static void main(String[] args) {
//        GenericInterface GI = new GenericInterface() {
//            @Override
//            public void fun() {
//
//            }
//
//            @Override
//            public void greet() {
//
//            }
//
//            @Override
//            public void display(Object value) {
//
//            }
//        }
//    }
//}