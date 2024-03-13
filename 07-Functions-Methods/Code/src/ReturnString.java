public class ReturnString {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }

    static String greet()
    {
        String greeting = "Hey, How are you ?";
       return greeting;
    }
}
