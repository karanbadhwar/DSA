import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //String Buffer is Mutable and Thread-Safe
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // By Default capacity is of 16.
        sb.append("Karan");
        System.out.println(sb.reverse());
        RandomString rs = new RandomString();
        System.out.println(rs.generate(5));

        //Removing WhiteSpaces
        String sentence = "Hi    I    am Karan";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s", ""));

        //Split Method
        String arr = "Karan Badhwar KB";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));

        //Rounding off
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        System.out.println(decimalFormat.format(7.09));
    }
}