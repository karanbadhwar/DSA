import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SuccessorOfNode {
    private static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.val = value;
        }
    }
    public TreeNode SuccessorNode(TreeNode node, int value) {
        if (node == null)
            return null;

        Queue<TreeNode> queue = new LinkedList();
        queue.offer(node);

        while (!queue.isEmpty()) {
            // int levelSize = queue.size();

            // for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                if (currentNode.val == value) {
                    break;
                }
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }

            // }

        }
        return queue.peek();
    }
}
