public class SegmentTree {
    
    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,8,4,9};

        SegmentTree tree = new SegmentTree(arr);
    }

    private class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public SegmentTree(int[] arr) {
        // Create the tree using this array
        this.root = constructTree(arr, 0, arr.length -1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        //Base condition
        if(start == end) {
            //We are at the Leaf Node
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        //Create a new Node for the current Index
        Node node = new Node(start, end);
        int mid = start + (end-start)/2;
        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

}
