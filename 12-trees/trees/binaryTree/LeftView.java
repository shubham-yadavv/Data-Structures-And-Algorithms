public class LeftView {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;

        }
    }

    int max_level = 0;

    void leftview(Node node, int level) {
        if (node == null) {
            return;
        }

        if (max_level < level) {
            System.out.print(" " + node.data);
            max_level = level;
        }

        leftview(node.left, level + 1);
        leftview(node.right, level + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(6);

        LeftView l = new LeftView();
        l.leftview(root, 1);
    }

}
