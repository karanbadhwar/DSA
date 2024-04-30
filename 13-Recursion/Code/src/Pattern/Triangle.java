package Pattern;

public class Triangle {
    public static void main(String[] args) {
        triangle2(4,0);
    }

    //Normal Triangle
    static void triangle2(int row, int col)
    {
        if(row == 0)
        {
            return;
        }

        if(row > col)
        {
            triangle2(row,col+1);
            System.out.print("* ");
        } else {
            triangle2(row-1, 0);
            System.out.println();
        }
    }

    //Pattern Triangle
    static void triangle(int row, int col)
    {
        if(row == 0)
        {
            return;
        }

        if(row > col)
        {
            System.out.print("* ");
            triangle(row,col+1);
        } else {
            System.out.println();
            triangle(row-1, 0);
        }
    }
}
