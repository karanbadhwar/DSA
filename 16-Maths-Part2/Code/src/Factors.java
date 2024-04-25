import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 20;
        optimizedFactors2(n);
    }

    //O(N) - Time Complexity
    static void factors1(int n)
    {
        for (int i = 1; i <= n; i++) {
            if(n % i == 0)
            {
                System.out.print(i+" ");
            }
        }
    }

    //O(Sqrt(N)) - Time Complexity
    static void optimizedFactors(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }

            //O(Sqrt(N)) - Time Complexity and space Complexity
            static void optimizedFactors2(int n)
        {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {
                    if (n / i == i) {
                        System.out.print(i + " ");
                    } else {
                        System.out.print(i + " ");
                        list.add(n/i);
                    }
                }
            }

            for (int i = list.size()-1; i >= 0; i--) {
                System.out.print(list.get(i)+" ");
            }
        }


    }

