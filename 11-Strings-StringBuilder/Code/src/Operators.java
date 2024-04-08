import java.util.ArrayList;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // ASCII CHAR value Added
        System.out.println("a" + "b"); //Concatenated String
        System.out.println((char)('a' + 3));

        System.out.println("a"+1); // as Console gets String Printed
        /*
            Breakdown:-
            when Integer wrapper class will call it's toString(),
            thus it prints String Representation on Output Stream

            Output - "a" + "1"

            Note:- only + will work on String, as Operator (+) is Overloaded on String minus(-) won't work
         */

        System.out.println("Karan" + new ArrayList<>(List.of(10)));

//        System.out.println("Badhwar" + new ArrayList<>(new int[] {1,2,3}));
        //Note:- ArrayList cannot have Primitive Type, only Objects as Arguments

//        Object name = "Karan"; //
//        System.out.println(name.toString());

        //---------------------------------------------------------------------------------

        //+ won't work as Operator only works on Primitive or any one value is String with Complex Objects
//        System.out.println(56 + new ArrayList<>(List.of(10))); // this is an Expression

        System.out.println("----------------------------------------------------------------");
        System.out.println(56 +""+ new ArrayList<>(List.of(10))); // It will work now
    }
}
