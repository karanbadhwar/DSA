package Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if(sudoku(board))
        {
            display(board);
        } else {
            System.out.println("Sudoku cannot be solved");
        }
    }

    static boolean sudoku(int[][] board)
    {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = false;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == 0) {
                    row = r;
                    col = c;
                    emptyLeft = true;
                    break;
                }

            }
            if (emptyLeft) {
                break;
            }
        }
            // if found some empty elements in row, then break
            if(!emptyLeft)
            {
                //Sudoku is solved
                return true;
            }

            //Placing the values in the Sudoku
        for (int number = 1; number <= 9 ; number++) {
            if(isSafe(board, row, col, number))
            {
                board[row][col] = number;
                if(sudoku(board))
                {

                    return true;
                } else {
                    //Backtrack
                    board[row][col] = 0;
                }
            }
        }
    return false;

    }

    private static void display(int[][] board) {
        for(int[] row: board)
        {
            for (int num: row)
            {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }


    static boolean isSafe(int[][] board, int row, int col, int num)
    {
        //Checking Vertical(Row)
        for (int i = 0; i < board.length; i++) {
            //Checking if the number is in the row or not
            if(board[i][col] == num)
            {
                return false;
            }
        }

        //Checking Horizontal(Column)
        for (int i = 0; i < board.length; i++) {
            //Checking if the number is in the Col or not
            if(board[row][i] == num)
            {
                return false;
            }
        }

        //Square Root of the Board
        // Then figuring out the Start and End of individual Box
        //Formula - rowStart = row - row % sqrt
        //Formula - colStart = col - col % sqrt

        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        //Checking for every element inside the box
        for (int r = rowStart; r < rowStart+sqrt; r++) {
            for (int c = colStart; c < colStart+sqrt; c++) {
                //Checking for element at individual box inside the Board(Sudoku)
                if(board[r][c] == num)
                {
                    return false;
                }
            }
        }
        return true;
    }


    //Leetcode
    static void sudoku2(char[][] board)
    {
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = false;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == '.') {
                    row = r;
                    col = c;
                    emptyLeft = true;
                    break;
                }

            }
            if (emptyLeft) {
                break;
            }
        }
        // if found some empty elements in row, then break
        if(!emptyLeft)
        {
            //Sudoku is solved
            return;
        }

        //Placing the values in the Sudoku
        for (int number = 1; number <= 9 ; number++) {
            if(isSafe2(board, row, col, (char)number))
            {
                board[row][col] = (char)number;
                if(sudoku2(board))
                {

                    return;
                } else {
                    //Backtrack
                    board[row][col] = 0;
                }
            }
        }


    }

    private static void display2(int[][] board) {
        for(int[] row: board)
        {
            for (int num: row)
            {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }


    static boolean isSafe2(char[][] board, int row, int col, char num)
    {
        //Checking Vertical(Row)
        for (int i = 0; i < board.length; i++) {
            //Checking if the number is in the row or not
            if(board[i][col] == num)
            {
                return false;
            }
        }

        //Checking Horizontal(Column)
        for (int i = 0; i < board.length; i++) {
            //Checking if the number is in the Col or not
            if(board[row][i] == num)
            {
                return false;
            }
        }

        //Square Root of the Board
        // Then figuring out the Start and End of individual Box
        //Formula - rowStart = row - row % sqrt
        //Formula - colStart = col - col % sqrt

        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        //Checking for every element inside the box
        for (int r = rowStart; r < rowStart+sqrt; r++) {
            for (int c = colStart; c < colStart+sqrt; c++) {
                //Checking for element at individual box inside the Board(Sudoku)
                if(board[r][c] == num)
                {
                    return false;
                }
            }
        }
        return true;
    }

}
