//leetcode 236 - Lowest Common Ancestor of a Binary Tree

class LCA {
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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         if(root == null) {
             return null;
         }

         if(root == p || root == q) {
             return root;
         }

         TreeNode left = lowestCommonAncestor(root.left, p , q);
         TreeNode right = lowestCommonAncestor(root.right, p , q);

         if(left != null && right != null) {
             return root;
         }

         return left == null ? right : left;

    }
}
