package binaryTree;

public class DiameterOfTree2 {

    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter(Node root) {
        if(root == null){
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter(root.left);
        TreeInfo right = diameter(root.right);

        int myheight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam = left.ht + right.ht + 1;

        int mydiameter = Math.max(Math.max(diam1, diam2), diam);

        return new TreeInfo(myheight, mydiameter);

    }


    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        TreeInfo treeInfo = diameter(root);
        System.out.println(treeInfo.diam);
    }

}
