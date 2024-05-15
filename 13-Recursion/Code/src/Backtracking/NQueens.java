package Backtracking;

import java.util.Arrays;

import static jdk.internal.org.jline.keymap.KeyMap.display;

public class NQueens {
    public static void main(String[] args) {

    }

    static int queens(boolean[][] board, int row)
    {
        //Base condition
        if(row == board.length)
        {
            display(board);
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
