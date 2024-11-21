//leet code 114

class FlattenBTLinkedList {
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

    public void flatten(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode currentNode = root;
        while (currentNode != null) {
            if (currentNode.left != null) {
                TreeNode temp = currentNode.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = currentNode.right;
                currentNode.right = currentNode.left;
                currentNode.left = null;
            }
            currentNode = currentNode.right;
        }
    }
}