package StaticExample;

//Static methods and variables are resolved during compile time!!

//Initialization of Static Variables
public class staticInitialize {
    static int a = 4;
    static int b;

    //Static block is executed once when the class is loaded; only when the first Object is created
    //As soon as the class runs, all the static part runs first
    static {
        System.out.println("In static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        staticInitialize obj = new staticInitialize();
//        System.out.println(a + " "+ b); // As it is inside Static Block
        System.out.println(staticInitialize.a + " " + staticInitialize.b);

        staticInitialize.b += 3; // this will change the static variable permanently,

        staticInitialize obj2 = new staticInitialize();
        System.out.println(staticInitialize.a + " " + staticInitialize.b);

    }

}
