public class PathExist {
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
    public boolean findPath(TreeNode node, int[] arr) {
        if(node == null) {
            return arr.length == 0;
        }

        return helper(node, arr, 0);
    }

    public boolean helper(TreeNode node, int[] arr, int index) {
        if(node == null) {
            return false;
        }

        if(index >= arr.length || node.val != arr[index]) {
            return false;
        }

        if(node.left == null && node.right == null && index == arr.length -1) {
            return true;
        }

        return helper(node.left, arr, index + 1) || helper(node.right, arr,index + 1);
    }
}
