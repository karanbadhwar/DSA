//leetcode 116

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

public class NextRightPointer {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}
        
        public Node(int _val) {
            val = _val;
        }
    }

    //Without Queue
    public Node connect(Node root) {
        if (root == null) 
            return null;

        Node leftMostNode = root;
        while (leftMostNode.left != null) {
            Node currentNode = leftMostNode;
            while(currentNode != null) {
                if(currentNode.left != null) {
                    currentNode.left.next = currentNode.right;
                    if(currentNode.next != null) {
                        currentNode.right.next = currentNode.next.left;
                    }
                    currentNode = currentNode.next;
                }
            }
            leftMostNode = leftMostNode.left;
        }
        return root;
    }
}





