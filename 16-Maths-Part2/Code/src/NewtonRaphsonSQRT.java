public class NewtonRaphsonSQRT {
    // Complexity O(logN)f(N)

    //Formula -> root = (x + N/x)/2 X-> sqrt we assumed
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(int n)
    {
        double x = n;
        double root;

        while(true)
        {
            root = (x + n/x)/2;

            if(Math.abs(root - x) < 0.1)
            {
                break;
            }
            x = root;
        }

        return root;
    }
}
