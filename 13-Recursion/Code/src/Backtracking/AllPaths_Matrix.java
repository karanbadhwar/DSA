package Backtracking;

import java.util.Arrays;

public class AllPaths_Matrix {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };

        int[][] path = new int[board.length][board[0].length];

        allPathPrint("", board, 0, 0, path, 1);
    }

    //All Paths and the Matrices
    static void allPathPrint(String pro, boolean[][] maze,int row, int col, int[][] path, int step)
    {
        //Base Condition
        if(row == maze.length-1 && col == maze[0].length-1)
        {
            path[row][col] = step;
            System.out.println("Path");

            for(int[] arr: path)
            {

                System.out.println(Arrays.toString(arr)+"");
            }
            System.out.println(pro);
            System.out.println();
            return;
        }

        //If the PLace has been visited
        if(!maze[row][col])
        {
            return;
        }

        //Considering this block in the Path
        maze[row][col] = false;

        //Adding the answer inside the path Array
        path[row][col] = step;

        //Going Down
        if(row < maze.length - 1) {

            allPathPrint(pro + "D", maze,row + 1, col, path, step+1);
        }

        //Going Right
        if(col < maze[0].length - 1) {
            allPathPrint(pro + "R", maze, row, col + 1, path, step+1);
        }

        //Going Up
        if(row > 0) {

            allPathPrint(pro + "U", maze,row - 1, col, path, step+1);
        }

        //Going Left
        if(col > 0) {
            allPathPrint(pro + "L", maze, row, col - 1, path, step+1);
        }

        //Before the function gets removed also change the changes made earlier(Backtracking)
        maze[row][col] = true;
        path[row][col] = 0;
    }
}
