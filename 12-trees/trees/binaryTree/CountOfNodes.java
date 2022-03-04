package binaryTree;

public class CountOfNodes {
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1 ;
    }

    static class Node{
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(countNodes(root));
    }


}
