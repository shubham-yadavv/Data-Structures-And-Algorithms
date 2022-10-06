package binaryTree.DFS;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Tree {
    Node root;

    Tree() {
        root = null;
    }

    void preorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void inorder(Node root){
        if (root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    void postorder(Node root){
        if (root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);


        System.out.println("\nPreorder traversal ");
        tree.preorder(tree.root);

        System.out.println("\nInorder traversal ");
        tree.inorder(tree.root);

        System.out.println("\nPostorder traversal ");
        tree.postorder(tree.root);
    }
}