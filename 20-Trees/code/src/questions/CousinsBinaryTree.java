import java.util.LinkedList;
import java.util.Queue;

public class CousinsBinaryTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        
        if(root == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
 
        boolean cousin1= false;
        boolean cousin2= false;

        while(!queue.isEmpty()){
            int levelSize = queue.size();

            for(int i = 0; i < levelSize; i++){

                TreeNode currentNode = queue.poll();

                if (currentNode.left != null && currentNode.right != null) {
                    if ((currentNode.left.val == x && currentNode.right.val == y) ||
                        (currentNode.left.val == y && currentNode.right.val == x)) {
                        return false; // They share the same parent
                    }
                }
                
                if(x == currentNode.val) {
                    cousin1 = true;
                }
                if(y == currentNode.val) {
                    cousin2 = true;
                }

                if(currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
                
                if(cousin1 && cousin2 ) {
                    return true;
                }
            }
            cousin1 = false;
            cousin2 = false;
        }

        return false;
    }

    public TreeNode findParent(TreeNode root, int x) {
        if(root == null) {
            return null;
        }
        if(root.left.val == x || root.right.val == x) {
            return root;
        }
        findParent(root.left, x);
        findParent(root.right, x);
    }
}
