//Leetcode 104 Maximum Depth of Binary Tree
// DFS (Post Order)
class MaxDepthOfBT {
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
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int leftTree = maxDepth(root.left);
        int rightTree = maxDepth(root.right);

        return Math.max(leftTree, rightTree) +1;
    }
}