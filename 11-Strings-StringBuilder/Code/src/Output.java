public class Output {
    public static void main(String[] args) {

        //Internally println calls toString() Method
        //Println no matter what prints String at the Console
        System.out.println(77);

        System.out.println("Karan");

//        Integer num = new Integer(56);
//        System.out.println(num.toString()); // Overrided toString() Method

        System.out.println(new int[]{1,2,3,4});

        String name = null;
        System.out.println(name);

        Object naam = "Karan";
        System.out.println(naam);
    }
}
