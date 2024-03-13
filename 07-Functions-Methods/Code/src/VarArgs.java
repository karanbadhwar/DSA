import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        VarArgs - Variable Number of Arguments (Any number of arguments) o or more
        //VarArgs should be the last in the last of parameters
        fun(3,4,5,6,7,8,8);
        fun();

        multiple(5,10);
        multiple(5,10, "Karan", "Badhwar");
    }

    static void demo(String ...s)
    {
        System.out.println(Arrays.toString(s));
    }

    static void demo(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...s) // a, b Needs to be passed and should in same order
    {

    }
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
