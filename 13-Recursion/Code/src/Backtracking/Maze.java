package Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        path("",3,3);
//        System.out.println(pathRetDiagonal("", 3,3));
        boolean[][] board = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        pathRestrict("", board, 0,0);
    }

    //Returning Count
    static int count(int row, int col)
    {
        //Base Condition
        if(row == 1 || col == 1)
        {
            return 1;
        }

        int left = count(row -1, col);
        int right = count(row, col -1);

        return left + right;
    }

    //Printing the Full Paths
    static void path(String pro, int row, int col)
    {
        if(row == 1 && col == 1)
        {
            System.out.println(pro);
            return;
        }
        if(row > 1) {
            path(pro + "D", row - 1, col);
        }
        if(col>1) {
            path(pro + "R", row, col - 1);
        }
    }

    //Returning the Full Paths
    static ArrayList<String> pathRet(String pro, int row, int col)
    {
        if(row == 1 && col == 1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(row > 1) {
            list.addAll(pathRet(pro + "D", row - 1, col));
        }
        if(col>1) {
            list.addAll(pathRet(pro + "R", row, col - 1));
        }
        return list;
    }

    //Returning the Full Paths Including Diagonal
    static ArrayList<String> pathRetDiagonal(String pro, int row, int col)
    {
        if(row == 1 && col == 1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(row > 1 && col > 1)
        {
            list.addAll(pathRetDiagonal(pro+"D", row -1, col -1));
        }

        if(row > 1) {
            list.addAll(pathRetDiagonal(pro + "V", row - 1, col));
        }
        if(col>1) {
            list.addAll(pathRetDiagonal(pro + "H", row, col - 1));
        }
        return list;
    }

    //Path with Restriction
    static void pathRestrict(String pro, boolean[][] maze,int row, int col)
    {
        //Base Condition
        if(row == maze.length-1 && col == maze[0].length-1)
        {
            System.out.println(pro);
            return;
        }

        if(!maze[row][col])
        {
            return;
        }

        if(row < maze.length - 1) {

            pathRestrict(pro + "D", maze,row + 1, col);
        }
        if(col < maze[0].length - 1) {
            pathRestrict(pro + "R", maze, row, col + 1);
        }
    }
}
