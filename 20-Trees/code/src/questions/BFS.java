import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import javax.swing.tree.TreeNode;

public class BFS {
      private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public BFS(){

    }

    private Node root;
    //inserting at the root node
    public void populate(Scanner scanner) {
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node) {
       System.out.println("Do you want to enter to the left of the Node: "+node.value);
       boolean left = scanner.nextBoolean();
       if(left){
        System.out.println("Enter the left child of "+node.value);
        int value = scanner.nextInt();
        node.left = new Node(value);
        populate(scanner, node.left);
       }

       System.out.println("Do you want to enter to the right of the Node: "+node.value);
       boolean right = scanner.nextBoolean();
       if(right){
        System.out.println("Enter the right child of "+node.value);
        int value = scanner.nextInt();
        node.right = new Node(value);
        populate(scanner, node.right);
       }
        
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root == null) return result;

        Queue<Node> queue = new LinkedList();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelValues = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                levelValues.add(currentNode.value);

                if(currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
                result.add(levelValues);
            }
            
        }

        return result;
    }


    // Displaying the Tree alltogether
    public void display() {
        display(root, " ");
    }

    private void display(Node node, String indent) {
        if(node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left,indent + "\t");
        display(node.right,indent  +"\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if(node == null){
            return;
        }

        prettyDisplay(node.right, level + 1);

        if(level != 0) {
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|----->"+ node.value);
        }else {
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level + 1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       BFS tree = new BFS();
       tree.populate(scanner);
    //    tree.prettyDisplay();
        tree.bfsTraversal();

    }
}
