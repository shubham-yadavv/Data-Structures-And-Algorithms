package bst;

public class SearchBST {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    static Node search(Node root, int val){
        if (root == null){
            return null;
        }
        if ( val == root.data){
            return root;
        }
        if (val < root.data ){
            return search(root.left, val);
        }
        return search(root.right, val);
    }


    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(6);

        if (search(root, 3) == null){
            System.out.println("value not found !!");
        }else{
            System.out.println("value found !!!");
        }

    }
}
