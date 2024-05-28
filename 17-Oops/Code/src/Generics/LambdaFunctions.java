package Generics;

import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args) {
        /*
        Lambda Functions are in line functions or One Liner functions

        A functional interface is an interface that contains only one abstract method.
         */


        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }


        //Way -> 1
        arr.forEach((item) -> System.out.println(item * 2));

        //Way -> 2
//        arr.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer item) {
//                System.out.println(item * 2);
//            }
//        });


        //Way -> 3
//        // Using an explicit Consumer implementation
//        Consumer<Integer> consumer = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer item) {
//                System.out.println(item * 2);
//            }
//        };
//        arr.forEach(consumer);

        Operation sum = (a, b) -> a + b;
//        Operation xyz = new Operation() {
//            @Override
//            public int operation(int a, int b) {
//                return a + b;
//            }
//        };
        Operation product = (a, b) -> a * b;
        Operation subtract = (a, b) -> a - b;

        LambdaFunctions obj = new LambdaFunctions();

        obj.operate(5, 4, sum);
        obj.operate(5, 4, product);
        obj.operate(5, 4, subtract);
    }


    int sum(int a, int b) {
        return a + b;
    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}


@FunctionalInterface
interface Operation {
    int operation(int a, int b);
}