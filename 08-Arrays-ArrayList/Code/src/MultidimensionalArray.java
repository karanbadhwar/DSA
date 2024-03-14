public class MultidimensionalArray {

    public static void main(String[] args) {
        //Multidimensional Array
        /*
            1 2 3
            4 5 6
            7 8 9

            Syntax:-
            dataType[][] variable_name = new dataType[rows][columns]
            //Mentioning Columns is not compulsory
         */

        int[][] arr = new int[3][];

       arr[1] = new int[2];
       arr[0] = new int[3];
       arr[2] = new int[4];

            //OR

        int[][] arr2D = {
                {1,2,3}, //0th Index
                {4,5}, //1st Index
                {6,7,8,9} //2nd Index -> arr2D[2] = {6,7,8,9}
        };
    }
}
