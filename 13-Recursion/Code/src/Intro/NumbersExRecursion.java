package Intro;

public class NumbersExRecursion {
    public static void main(String[] args) {
        /*
            Recursion - A function that calls itself
         */
        print(1);
    }
    static void print(int n)
    {
        if(n == 5) //Base Condition, i.e. which stops Recursion from making more recursive calls
        {
            System.out.println(n);
            return;
        }

        System.out.println(n);

        // recursive call
        // if you are calling a function again and again, you can treat it as a separate call in the stack

        // this is called tail recursion
        // this is the last function call
        print(n+1);
    }
}
