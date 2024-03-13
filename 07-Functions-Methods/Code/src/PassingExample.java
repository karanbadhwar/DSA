public class PassingExample {
    //In outer scope
//    static String name = "Karan badhwar";
    public static void main(String[] args) {

        String name = "Karan badhwar";
        //In Java, we only pass by value when passing params
        greet(name);


        System.out.println(name);
    }

    static void greet(String naam)
    {
        naam = "Badhwar G";
    }
}


//Trying to change array, i.e. re-assigning
/* // Pass by value of the reference variable !!!
public class PassingExample {

    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 12;
        arr[2] = 22;
        arr[1] = 32;
        arr[3] = 42;
        greet(arr);
        for(int x: arr)
            System.out.println(x);
    }

    static void greet(int[] naam)
    {
        int[] arr2 = new int[2];
        arr2[0] = 100;
        arr2[1] = 200;

        naam = arr2;
    }
}
 */