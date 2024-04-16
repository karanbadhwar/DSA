public class Main {
    public static void main(String[] args) {
        System.out.println("Time and Space Complexity!");

        /*
               Time Complexity != Time Taken

               Time Complexity is a function gives us the relationship about -
               how time will grow as the input grows.

               Suppose in Linear Complexity - y = k*x;
               k is the slope that shows how will time change as input grows
               Note:- Y is Time taken and X is Input/Size
         */

        /* Time Complexity
        Notations:-
            Big O - Upper Bound (Complexity cannot exceed than this)
            Big O - f(N)/g(N) < Infinity (f <= g)

            Big-Omega - Lower Bound (Minimum Complexity will be this)
            Big-Omega - f(N)/g(N) > 0 (f >= g)

            Big-Theta - When a function have both Lower and Upper bound
            Big Theta - 0 < f(N)/g(N) < Infinity

            Little-O - It is loose Upper Bound
            Little-o - f(N)/g(N) = 0 (f < g) strictly slower than g

            Little-Omega - It is loose Lower Bound
            Little-Omega - f(N)/g(N) = Infinity (f > g) strictly slower than g
         */

        /* Space Complexity = Input Space + Auxiliary Space !!
            Auxiliary space is the Extra Space taken by the Algorithm
            Ex:- In Binary Search, an array will only take extra(Auxiliary) 3 spaces regardless of how much,
            array size increases.

         */

        /*
            Only calls that are Interlinked with each other will be in Stack at the same time!
            NO two functions will be in the stack that are on the same level in Recursion Tree

            Ex:- In Fibonacci Numbers with Recursion space complexity will be O(N) height of the tree
         */

        /*
            Type of Recursion;
            1 - Linear - (Ex- Fibonacci = F(N) = F(N-1) + F(N-2))
            2 - Divide and Conquer (Ex - Binary Search = F(N) = F(N/2) + O(1)) T(n)=aT(n/b)+f(n) - FORM
         */

        /*
            How to solve to get complexity -
            1 - Plug and Chug
            2 - Master's Theorem
            3 - Akra Bazzi Formula
         */

        /*
            Akra Bazzi:-
         */

    }
}