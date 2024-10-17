import java.util.Scanner;

public class BinaryTree {
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public BinaryTree(){

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

       System.out.println("Do you want to enter to the left of the Node: "+node.value);
       boolean right = scanner.nextBoolean();
       if(right){
        System.out.println("Enter the right child of "+node.value);
        int value = scanner.nextInt();
        node.right = new Node(value);
        populate(scanner, node.right);
       }
        
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
       BinaryTree tree = new BinaryTree();
       tree.populate(scanner);
       tree.prettyDisplay();
    }



}

/*Implementations of Binary Tree 
 * 1 - Linked Representation
 * 2 - Sequential Representation -> Using Arrays
*/