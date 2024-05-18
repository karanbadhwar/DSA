package Introduction;

public class WrapperExamples {
    public static void main(String[] args) {
        System.out.println("Wrapper classes are for converting Primitive to Objects");
//        int a = 10;
        Integer a = 45;
        Integer b = 10;

//        swap(a, b);

//        System.out.println(a + " " + b);

        //Final Keyword
        final int BONUS = 2;
//        BONUS = 3; // Cannot be changed
    }

    //Integer is a final class, it's value will not change
    //Final prevents from getting the Content modified
    //Final variable needs to be initialized when being declared!
    public static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;

        final Random RP = new Random("Random");
        RP.name = "Random Person";

//        RP = new Random("RP"); //Not Possible

        Random obj;

        for (int i = 1; i < 1000000000; i++) {
            obj = new Random("" + i);
        }
    }

}

/*
    Garbage Collection is done automatically by Java, but we can do some after actions once that has done,
    we can use Finalize() method
 */


class Random {
    final int num = 10;
    String name;

    Random(String name) {
        this.name = name;
    }

    //It will be inside the class, when an instance of the class is being destroyed, it will call
    // finalize method

    @Override // It has been deprecated now
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
