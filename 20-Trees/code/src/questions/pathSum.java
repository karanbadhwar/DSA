//leetcode 112. Path Sum

public class pathSum {
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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        if (root.val == targetSum && root.left == null && root.right == null)
            return true;

        boolean leftTree = hasPathSum(root.left, targetSum - root.val);
        boolean rightTree = hasPathSum(root.right, targetSum - root.val);

        if (leftTree || rightTree)
            return true;

        return false;
    }

}
