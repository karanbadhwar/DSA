public class Nto1 {
    public static void main(String[] args) {
        recurr(5);
    }

    static void recurr(int n)
    {
        if(n == 0)
        {
            return;
        }

        System.out.println(n); // Will print in DESC Order
        recurr(n-1);
//        System.out.println(n); // If needs to print in ASC Order
    }
}
