//Invert Binary Tree Leetcode 226
//DOne Using DFS (Post Order)
class InvertBT {
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
    public TreeNode invertTree(TreeNode root) {
        return invertion(root);
    }

    private TreeNode invertion(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode leftNode = invertion(root.left);
        TreeNode rightNode = invertion(root.right);
        root.left = rightNode;
        root.right = leftNode;
        return root;
    }
}