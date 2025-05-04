package av_recrusion;

public class PrintTillN {
    public static void main(String[] args) {
        printN(5);
    }

    public static void printN(int n){
        // Base Condition
        if (n == 1){
            System.out.println(n);
            return;
        }

        //Hypothesis
        printN(n-1);

        // Inductive Step
        System.out.println(n);
    }
}
