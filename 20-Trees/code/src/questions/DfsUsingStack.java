import java.util.Stack;

public class DfsUsingStack {
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
    public void dfsStack(TreeNode node) {
        if(node == null) return;

        Stack<TreeNode> stack = new Stack<>();

        //PreOrder Traversal
        stack.push(node);

        while(!stack.isEmpty()) {
            TreeNode removed = stack.pop();
            System.out.println(removed.val + " ");
        }

    }
}
}
