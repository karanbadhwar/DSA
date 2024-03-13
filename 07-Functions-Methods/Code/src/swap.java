public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        swap(a,b);
//        System.out.format("a: %d, b: %d", a,b);

        String name = "Karan badhwar";
        changeName(name);
        System.out.println(name);

//        String random = "Random";
//        random = "rrrandom";
//
//        System.out.println(random);
    }

    static void changeName(String name) {
        name = "Badhwar G";
    }

    static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;

        //This change is only valid inside this scope only
    }
}
