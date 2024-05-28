package Generics.Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
            Comparing Objects -> by implementing Comparable Interface
         */

        Student karan = new Student(7, 99.56f);
        Student Badhwar = new Student(5, 85.11f);
        Student KK = new Student(12, 77.11f);
        Student KB = new Student(23, 65.45f);

        Student[] list = {karan, Badhwar, KK, KB};

        System.out.println(Arrays.toString(list));
//        Arrays.sort(list);

        //Giving custom compare To method in the parameter of sort method
        Arrays.sort(list, (o1, o2) -> (int) (o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));

//        if (karan > Badhwar) {
//            System.out.println("Karan has more marks than Badhwar");
//        }

//        if (karan.compareTo(Badhwar) > 0) {
//            System.out.println("Karan has more marks than Badhwar");
//        } else {
//            System.out.println("Badhwar has more marks than Karan");
//        }
    }
}
