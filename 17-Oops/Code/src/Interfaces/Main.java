package Interfaces;

public class Main {
    public static void main(String[] args) {
        /*
         * Interfaces -> In Interfaces, methods are by default Abstract and Variables are Static & Final.
         * Similar to Abstract classes, but Abstract classes cannot have Multiple Inheritance.
         * Default body is allowed.
         * Interfaces cannot have Instances.
         * Reason for the Final Variables inside the Interfaces -> Interfaces do not have constructors, so how,
           we will initialize them and Final Variables always need to be initialized.
         * Interfaces can be Inherited using Implement Keyword.
         * Implement multiple interfaces.
         * Interface to Interface -> extends
         * Interface to Class -> implements
         * Nested Interfaces can be Public, Protected and private while Normal Interfaces can only be,
           Public or Default.
         * Access Modifier for the Overridden methods should be same or better
            Ex -
            * if Protected method (a) is being overridden so the overridden method should at least be protected or public
                 not private!!

         */

        Car car = new Car();
//        car.random; // Can Access

        //Same rule will apply methods available in Engine will only be able to run
        Engine car2 = new Car();
//        car2.random //Cannot access

//        int price = car2.PRICE;
//        System.out.println(price);
//
//        Media carMedia = new Car();
//
//        carMedia.stop();

//
//        car.acc();
//        car.start();
//        car.stop();


        NiceCar car3 = new NiceCar();
        car3.start();
        car3.startMusic();

        car3.upGradeEngine(new ElectricEngine());
        car3.start();

//        NiceCar car4 = new NiceCar(new ElectricEngine());
//        car4.start();
    }
}
