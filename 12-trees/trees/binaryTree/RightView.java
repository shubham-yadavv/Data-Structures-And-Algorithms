package binaryTree;

public class RightView {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    int max_level = 0;
    public void rightview(Node node, int level){
        if (node == null){
            return;
        }
        if (max_level < level){
            System.out.print(" " + node.data);
            max_level = level;
        }

        rightview(node.right, level + 1);
        rightview(node.left, level + 1);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        RightView r  = new RightView();
        r.rightview(root, 1);

    }
}