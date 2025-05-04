package Backtracking;

public class AllDirectionalPath {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        allPath("", board, 0, 0);
    }
    //All Paths with all directions accepted
    static void allPath(String pro, boolean[][] maze,int row, int col)
    {
        //Base Condition
        if(row == maze.length-1 && col == maze[0].length-1)
        {
            System.out.println(pro);
            return;
        }

        //If the PLace has been visited
        if(!maze[row][col])
        {
            return;
        }

        //Considering this block in the Path
        maze[row][col] = false;

        //Going Down
        if(row < maze.length - 1) {

            allPath(pro + "D", maze,row + 1, col);
        }

        //Going Right
        if(col < maze[0].length - 1) {
            allPath(pro + "R", maze, row, col + 1);
        }

        //Going Up
        if(row > 0) {

            allPath(pro + "U", maze,row - 1, col);
        }

        //Going Left
        if(col > 0) {
            allPath(pro + "L", maze, row, col - 1);
        }

        //Before the function gets removed also change the changes made earlier(Backtracking)
        maze[row][col] = true;
    }
}
