package bst;

public class CheckForBST {

    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
        }
    }

    static boolean isBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }

        if (min != null && min.data >= root.data) {
            return false;
        }

        if (max != null && max.data <= root.data) {
            return false;
        }

        return isBST(root.left, min, root) && isBST(root.right, root, max);
    }

    public static void main(String args[])
    {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);

        if (isBST(root,null,null))
            System.out.print("Is BST");
        else
            System.out.print("Not a BST");
    }
}

