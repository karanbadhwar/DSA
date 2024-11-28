// leetcode 124. Binary Tree Maximum Path Sum

public class BtMaxPathSum {
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

    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        return helper(root);
    }

    public int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftTree = helper(root.left);
        int rightTree = helper(root.right);

        leftTree = Math.max(0, leftTree);
        rightTree = Math.max(0, rightTree);
        int pathSUm = leftTree + rightTree + root.val;

        max = Math.max(pathSUm, max);

        return Math.max(leftTree,rightTree) + root.val;
    }
}
