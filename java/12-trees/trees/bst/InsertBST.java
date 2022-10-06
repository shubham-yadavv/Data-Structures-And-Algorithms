package bst;

public class InsertBST {
    static class Node{
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static Node insert(Node root, int val){
        if (root == null){
            return new Node(val);
        }

        if (val < root.data){
            root.left = insert(root.left, val);

        }else{
            root.right = insert(root.right, val);
        }
        return root;
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
        Node root = null;
        root = insert(root, 5);
        insert(root, 1);
        insert(root, 3);
        insert(root, 4);
        insert(root, 2);
        insert(root, 7);

        inorder(root);
    }
}
