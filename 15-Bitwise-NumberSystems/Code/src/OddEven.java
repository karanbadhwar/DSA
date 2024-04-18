public class OddEven {
    public static void main(String[] args) {
        int n = 66;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1; // Using AND Operator As AND a number with 1 will give it's actual digit
    }
}
