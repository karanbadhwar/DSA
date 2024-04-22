public class NoOfDigits {
    public static void main(String[] args) {
        int num = 34567;
        int base = 10;

        int ans = (int)(Math.log(num) / Math.log(base)) + 1;
        System.out.println(ans);
    }
}
