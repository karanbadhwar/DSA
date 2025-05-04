package Backtracking;



public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight(board,0,0,n);
    }

    static void knight(boolean[][] board, int row, int col , int knights)
    {
        //Base condition
        if(knights == 0)
        {
            display(board);
            System.out.println();
            return;
        }

        //If row is out of bound
        if(row == board.length)
        {
            return;
        }

        //Moving down to new Row, if the cols are checked and not safe to place the knight
        if(col == board.length)
        {
            knight(board, row+1, 0, knights);
            return;
        }

        //Check for the safety of the knight and placing the Knight
        if(isSafe(board,row,col))
        {
            board[row][col] = true;
            knight(board,row,col+1,knights-1);
            //BackTracking
            board[row][col] = false;
        }

        //If not safe still need to proceed
        knight(board,row,col+1,knights);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //Check 2*Top + 1*Left
        if(isValid(board,row-2,col-1))
        {
            if(board[row-2][col-1])
            {
                return false;
            }
        }

        //Check 2*Top + 1*Right
        if(isValid(board,row-2,col+1))
        {
            if(board[row-2][col+1])
            {
                return false;
            }
        }

        //Check 1*Top + 2*Left
        if(isValid(board,row-1,col-2))
        {
            if(board[row-1][col-2])
            {
                return false;
            }
        }

        //Check 1*Top + 2*Right
        if(isValid(board,row-1,col+2))
        {
            if(board[row-1][col+2])
            {
                return false;
            }
        }

        return true;
    }

    static boolean isValid(boolean[][] board,int row, int col)
    {
        if(row >= 0 && row <= board.length-1 && col >= 0 && col <= board.length-1)
        {
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for(boolean[] arr: board)
        {
            for(boolean element: arr)
            {
                if(element)
                {
                    System.out.print("K ");
                } else
                {
                    System.out.print("X ");
                }

            }
            System.out.println();
        }
    }

}
