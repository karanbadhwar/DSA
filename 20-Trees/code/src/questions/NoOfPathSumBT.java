import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class NoOfPathSumBT {
     public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int countPths(TreeNode node, int sum) {
        List<Integer> path = new ArrayList<>();
        return helper(node, sum, path);
    }

    public int helper(TreeNode node, int targetSum, List<Integer> path) {
        if(node == null) {
            return 0;
        }

        path.add(node.val);
        int count = 0;
        int sum = 0;

        //Counting paths
        ListIterator<Integer> itr = path.listIterator(path.size());

        while(itr.hasPrevious()) {
            sum += itr.previous();

            if(sum == targetSum) {
                count++;
            }
        }
        
        count += helper(node.left, targetSum, path) + helper(node.right, targetSum, path);


        //backtrack
         path.remove(path.size() - 1);

        return count;
    }


     public  List<List<Integer>> findPaths(TreeNode node, int sum) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helperList(node, sum, path, paths);
        return paths;
    }

    public void helperList(TreeNode node, int targetSum,List<Integer> path, List<List<Integer>> paths) {
        if(node == null) {
            return;
        }

        path.add(node.val);


        if(node.val == targetSum && node.left == null && node.right == null) {
            paths.add(new ArrayList<>(path));
        } else {
            helperList(node.left, targetSum - node.val, path, paths);
            helperList(node.right, targetSum - node.val, path, paths);;
        }

        //backtrack
         path.remove(path.size() - 1);

    }
}