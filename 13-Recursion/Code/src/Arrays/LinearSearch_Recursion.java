package Arrays;

import java.util.ArrayList;

public class LinearSearch_Recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,4,18,9,9};
//        System.out.println(findIndex(arr,9,0));
//        System.out.println(findIndexLast(arr,9,arr.length-1));
//        findAllIndex(arr,9,0);
//        System.out.println(list);
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAllIndex(arr,9,0,new ArrayList<Integer>()); Same as Below, just list initialized outside
//        ArrayList<Integer> ans = findAllIndex(arr,9,0,list);
//        System.out.println(ans);
//        System.out.println(list);
        System.out.println(findAllIndex_List(arr,9,0));

    }

    static int findIndex(int[] arr, int target, int index)
    {
        //Base Condition
        if(index > arr.length-1)
        {
            return -1;
        }

//        if(arr[index] == target)
//        {
//            return true;
//        } else {
//            //Recursive Calls
//            return linearSearch(arr,target, index+1);
//        }

        if(arr[index] == target )
        {
            return index;
        }

        return findIndex(arr,target,index+1);
    }

    static int findIndexLast(int[] arr, int target, int index)
    {
        //Base Condition
        if(index == -1)
        {
            return -1;
        }

        if(arr[index] == target )
        {
            return index;
        }

        return findIndexLast(arr,target,index-1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index)
    {
        //Base Condition
        if(index == arr.length)
        {
            return;
        }

        if(arr[index] == target )
        {
            list.add(index);
        }

        findAllIndex(arr,target,index+1);
    }

    //Returning ArrayList with Arraylist getting in Arguments
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index,ArrayList<Integer> list)
    {
        //Base Condition
        if(index == arr.length)
        {
            return list;
        }

        if(arr[index] == target )
        {
            list.add(index);
        }

        return findAllIndex(arr,target,index+1, list);
    }


    //Returning ArrayList without Arraylist getting in Arguments
    static ArrayList<Integer> findAllIndex_List(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        //Base Condition
        if(index == arr.length)
        {
            return list;
        }

        //This will contain answer from individual function call only
        if(arr[index] == target )
        {
            list.add(index);
        }

        ArrayList<Integer> listReturned = findAllIndex_List(arr,target,index+1);

        //Returned List i.e. Answer from below calls
        if(listReturned.size() > 0)
        {
//            for (int value: listReturned)
//                list.add(value);
            list.addAll(listReturned);
        }

        return list;
    }
}
