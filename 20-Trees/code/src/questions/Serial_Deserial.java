// leetcode 297. Serialize and Deserialize Binary Tree

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Serial_Deserial {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root, list);
        return String.join(",", list);
    }

    public void helper(TreeNode node, List<String> list) {
        if(node == null) {
            list.add(null);
            return ;
        }

        list.add(String.valueOf(node.val));

        helper(node.left, list);
        helper(node.right, list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] stringList = data.split(",");
        List<String> list = new ArrayList<>(Arrays.asList(stringList));
        Collections.reverse(list);

        return helperDeserial(list);
    }

    public TreeNode helperDeserial(List<String> list) {
        String value = list.remove(list.size() - 1);

    if ("null".equals(value)) {
        return null;
    }

        TreeNode node = new TreeNode(Integer.parseInt(value));

        node.left = helperDeserial(list);
        node.right = helperDeserial(list);
        return node;

    }

}