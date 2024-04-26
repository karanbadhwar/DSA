public class Fact {
    public static void main(String[] args) {
        System.out.println(fact(5)); // Last return of the Recursion will be returned over here, where the function is called
    }

    static int fact(int n)
    {
        if(n == 1) //Base condition
        {
            return 1;
        }
        return n * fact(n-1);
    }
}
