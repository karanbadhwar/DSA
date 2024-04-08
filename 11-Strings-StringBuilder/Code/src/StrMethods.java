import java.util.Arrays;
public class StrMethods {
    public static void main(String[] args) {
        String name = "Karan Badhwar";

        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.toLowerCase()); // Original one does not change, it creates a new One

        System.out.println(name.indexOf('a'));

        System.out.println(name.lastIndexOf('a'));

        System.out.println("  karan   ".strip());

        System.out.println(Arrays.toString(name.split(" ")));
    }
}
