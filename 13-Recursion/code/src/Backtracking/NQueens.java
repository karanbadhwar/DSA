package Backtracking;

import java.util.Arrays;


public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        queens(board,0);

        //Proof of backtracking happened
        for(boolean[] arr: board)
        {
            for(boolean element: arr)
            {
                if(element)
                {
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    static int queens(boolean[][] board, int row)
    {
        //Base condition
        if(row == board.length)
        {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        //Placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            //Place the queen if it is safe
            if(isSafe(board,row,col))
            {
                board[row][col] = true;

                    count += queens(board,row+1);
                    //Backtracking if the below row does not have safe place to place the queen
                    board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        //Check Vertical Row
        for (int i = 0; i < row; i++) {
            if(board[i][col])
            {
                return false;
            }
        }

        //Check Diagonal Left
        int maxLeft = Math.min(row,col);
        for (int i = 1; i <= maxLeft; i++) {
                if(board[row-i][col-i])
                {
                    return false;
                }
        }

        //Check Diagonal Right
        int maxRight = Math.min(row, board.length-col-1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i])
            {
                return false;
            }
        }

        return true;

    }

    private static void display(boolean[][] board) {
        for(boolean[] arr: board)
        {
            for(boolean element: arr)
            {
                if(element)
                {
                    System.out.print("Q ");
                } else
                {
                    System.out.print("X ");
                }

            }
            System.out.println();
        }
    }
}
