import java.util.Arrays;

public class Comparision {
    public static void main(String[] args) {
        String a = "Karan";
        String b = "Karan";

//        System.out.println(a == b); //True

        // == checks both value and reference (pointing to same Object)

        String c = new String("Karan");
        String d = new String("Karan");
        String e = new String("Karan   "); // Will be False on Comparing with any ref above

//        System.out.println(d == c); //False

        //When only needs to check value use .equals()

        System.out.println(a.equals(c)); // Comparing one created in Heap (outside String Pool and other in String Pool)

        System.out.println(Arrays.toString(c.getBytes())); // Value of Each Character as Per ASCII value
        // Strings are internally stored inside a Byte Array only

        System.out.println(c.charAt(0));
    }
}
