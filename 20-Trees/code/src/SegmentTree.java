import javax.management.QueryEval;

public class SegmentTree {
    
    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,8,4,9};

        SegmentTree tree = new SegmentTree(arr);

        System.out.println(tree.query(1,6));
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

    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        String str = "";

        //For left node of the Current Node
        if(node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " -> ";
        } else {
            str = str + "No left child";
        }

        //Current Node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <- ";

        
        //For right node of the Current Node
        if(node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data;
        } else {
            str = str + "No right child";
        }

        System.out.println(str);

        //Recursion call
        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }
    }

        // query
        public int query(int qsi, int qei) {
            return this.query(this.root, qsi, qei);
        }
        private int query(Node node, int qsi, int qei) {
            if(node.startInterval >= qsi && node.endInterval <= qei) {
            // node is completely lying inside query
            return node.data;
            } else if (node.startInterval > qei || node.endInterval < qsi) {
            // completely outside
            return 0;
            } else {
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
            }
        }


        public void update(int index, int value) {
            this.root.data = update(this.root, index, value);
        }

        private int update(Node node,int index, int value) {
          if(index >= node.startInterval && index <= node.endInterval) {
            //Base Condition 
            if(index == node.startInterval && index == node.endInterval) {
                node.data = value;
                return value;
            } else {
             // Recursive calls
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);

                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }

}