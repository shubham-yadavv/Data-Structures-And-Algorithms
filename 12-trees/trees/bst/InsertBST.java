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

    Node insert(Node root, int val){
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

    void inorder(Node root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = null;
        InsertBST i = new InsertBST();
        root = i.insert(root, 5);
        i.insert(root, 1);
        i.insert(root, 3);
        i.insert(root, 4);
        i.insert(root, 2);
        i.insert(root, 7);

        i.inorder(root);
    }
}
