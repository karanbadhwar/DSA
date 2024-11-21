
class SortedToBST {
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        // Find the middle element
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        // Recursively build the left and right subtrees
        node.left = buildBST(nums, start, mid - 1);
        node.right = buildBST(nums, mid + 1, end);

        return node;
    }
}