package binaryTree;

public class FlattenBT {
    static class Node{
        int data;
        Node left, right;

        public Node (int data){
            this.data = data;
            left = right = null;
        }
    }

    void flatten(Node root){
        if (root == null || root.left == null && root.right == null){
            return;
        }
        if (root.left != null)
        {
            flatten(root.left);

            Node temp = root.right;
            root.right = root.left;
            root.left = null;

            Node t = root.right;
            while (t.right != null) {
                t = t.right;
            }
            t.right = temp;
        }
        flatten(root.right);
    }
    void printinorder(Node root){
        if (root == null){
            return;
        }
        printinorder(root.left);
        System.out.print(root.data + " ");
        printinorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(6);

        FlattenBT t = new FlattenBT();
        t.flatten(root);
        t.printinorder(root);
    }
}
