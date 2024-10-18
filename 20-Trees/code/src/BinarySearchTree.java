public class BinarySearchTree {
    // BST is a type of Binary Tree
    // Time Complexity -> log(N)

    /* Three types of traversal methods on BST: 
         1 -> Pre-Order N -> L -> R
         2 -> In-Order L -> N -> R
         3 -> Post-Order L -> R -> N
    */
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

        public int getValue()
        {
            return this.value;
        }
    }

    private Node root;

    public BinarySearchTree() {

    }

    //Height of the tree from given Node
    public int getHeight(Node node) {
        if(node == null) {
            return -1;
        }
        return node.height;
    }

    //Checking if the tree is empty or not
    public boolean isEmpty() {
        return root == null;
    }

    //Displaying the Tree
    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if(node == null) {
            return;
        }

        System.out.println(details + node.value);
        display(node.left, "left child of "+node.value+" : ");
        display(node.right, "right child of "+node.value+" : ");

    }

    //Insertion of a Node into the Tree
    public void insert(int value) {
        root = insert(root, value);
    }


    private Node insert(Node node, int value) {

        if(node == null) {
            return new Node(value);
        }

        if(value < node.value) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));

        return node;
    }

    //Inserting multiple values
    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public void populateSorted(int[] arr) {
       populateSorted(arr, 0, arr.length);
    }

    private void populateSorted(int[] arr, int start, int end) {
        //Base condition
        if(start >= end) {
            return;
        }

        int mid = (start + end) /2 ;
        insert(mid);
        populateSorted(arr, start, mid);
        populateSorted(arr, mid + 1, end);
    }

    //Checking if the Tree is balanced or not
    public boolean isBalanced() {
      return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if(node == null) {
            return true;
        }

        return Math.abs(getHeight(node.left) - getHeight(node.right)) <=1 && isBalanced(node.left) && isBalanced(node.right) ;
    }

    public void preOrder() {
        preOrder(root);
    }
    public void inOrder() {
        inOrder(root);
    }
    public void postOrder() {
        postOrder(root);
    }

    private void preOrder(Node node) {
        if(node == null) {
            return;
        }
        
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

       private void inOrder(Node node) {
        if(node == null) {
            return;
        }
        
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    private void postOrder(Node node) {
        if(node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");

    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] nums = {5,2,7,1,4,6,9,8,3,10};

        bst.populate(nums);

        // bst.display();

        bst.postOrder();
    }
}
