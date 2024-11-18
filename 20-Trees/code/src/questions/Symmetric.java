import java.util.LinkedList;
import java.util.Queue;

public class Symmetric {
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

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root.left);
        queue.add(root.right);

        while(!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            if(left == null && right == null) {
                continue;
            }
            if(left == null || right == null) {
                return false;
            }
            if(left.val != right.val) {
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);

        }

        return true;
    }

    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }

        if(s == goal) {
            return true;
        }

        String doubleS = s + s;
        System.out.println(doubleS);

        if(s.contains(goal)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }
}
