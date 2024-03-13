public class MethodOverloading {
    public static void main(String[] args) {
        fun(67);
        fun("Karan");
    }

    static void fun(int a)
    {
        System.out.println(a);
    }

//    static int fun(int a) //Parameters should be different
//    {
//        return a;
//    }

    static void fun(String name)
    {
        System.out.println(name);
    }
}


