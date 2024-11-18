//Leetcode 103
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BfsZigZagOrder {
       private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.val = value;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Deque<TreeNode> queue = new LinkedList();
        queue.offer(root);
            
        boolean reverse = false;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelList = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode;
                if(!reverse) {
                    currentNode = queue.pollFirst();
                    levelList.add(currentNode.val);
                    if (currentNode.left != null) {
                        queue.addLast(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.addLast(currentNode.right);
                    }
                } else {
                    currentNode = queue.pollLast();
                    levelList.add(currentNode.val);
                    if (currentNode.right != null) {
                        queue.addFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        queue.addFirst(currentNode.left);
                    }
                }

                
            }
            reverse = !reverse;
           result.add(levelList);
        }
         return result;
    }
    
}
