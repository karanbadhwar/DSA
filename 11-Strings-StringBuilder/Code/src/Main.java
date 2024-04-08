public class Main {
    public static void main(String[] args) {
        //Strings and StringBuilder

        /*
        Ways of Declaring a String
         */

        /*
        String - DataType
        name - Ref
        "Karan" - Object
         */
        String name = "Karan";

        String namee = new String("Karan"); // Remember both point to different Objects

        System.out.println(name == namee);//False

    }
}