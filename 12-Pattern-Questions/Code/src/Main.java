public class Main {
    public static void main(String[] args) {
        System.out.println("Pattern Questions");
//        pattern1(5);
//        pattern2(4);
//        pattern3(5);
//        pattern4(5);
//        pattern5(5);
//        pattern5Part2(5);
        pattern28(5);
    }

    static void pattern1(int n)
    {
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n ; col++) {
                System.out.print("* ");
            }
            //Completion of one Row, adding a new Line Below
            System.out.println();
        }

    }

    static void pattern2(int n)
    {
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            //Completion of one Row, adding a new Line Below
            System.out.println();
        }
    }

    static void pattern3(int n)
    {
        for (int row = 1; row <= n ; row++) {
            for (int col = n; col >= row ; col--) {
                System.out.print("* ");
            }
            //Completion of one Row, adding a new Line Below
            System.out.println();
        }

    }

    static void pattern4(int n)
    {
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print(col+" ");
            }
            //Completion of one Row, adding a new Line Below
            System.out.println();
        }

    }

    static void pattern5(int n)
    {
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("*");
            }
            //Completion of one Row, adding a new Line Below
            System.out.println();
        }
        for (int row = 1; row < n; row++) {
            for (int col = n; col > row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern5Part2(int n)
    {
        for (int row = 0; row < 2*n; row++) {
            int totalColInRow = row > n ? 2*n - row - 1: row;
            for (int col = 0; col <= totalColInRow; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern28(int n)
    {
        for (int row = 0; row < 2*n; row++) {
            int totalColInRow = row > n ? 2*n - row - 1: row;
            int totalSpaces = n - totalColInRow;
            for (int spaces = 0; spaces < totalSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


}