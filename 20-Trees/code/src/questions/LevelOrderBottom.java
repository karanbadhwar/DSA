import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderBottom {
       private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.val = value;
        }
    }

    public List<List<Integer>> levelOrderBot(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelList = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode;

                    currentNode = queue.poll();
                    levelList.add(currentNode.val);
                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
            }
           
           result.add(0,levelList);
        }
         return result;
    }

}
