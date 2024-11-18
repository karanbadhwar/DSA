public class diameter {

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
    }
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        return height(root);
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        int totalHeight = leftHeight + rightHeight;

        if(diameter < totalHeight) {
            diameter = totalHeight;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
