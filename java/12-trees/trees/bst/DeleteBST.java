package bst;

public class DeleteBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    static Node delete(Node root , int val) {
        if (val < root.data) {
            root.left = delete(root.left, val);
        } else if (val > root.data) {
            root.right = delete(root.right, val);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                root.data = inorderSucc(root.right);
                root.right = delete(root.right, root.data);
            }
        }
        return root;
    }

    private static int inorderSucc(Node root){
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    static void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(6);

        inorder(root);
        delete(root,  5);
        System.out.println();
        inorder(root);
    }
}