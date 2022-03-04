package binaryTree;
import java.util.*;

class LeftView {
    int maxLevel = 0;
    void leftview(Node root,int level, List<Integer> result){
        if (root == null){
            return;
        }

        if (maxLevel < level){
            result.add(root.data);
            maxLevel = level;
        }

        leftview(root.left, level + 1, result);
        leftview(root.right, level + 1 , result);

    }

}
class Node{
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

class Solution{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right  = new Node(6);

        List<Integer> result = new ArrayList<>();
        LeftView instance = new LeftView();
        instance.leftview(root,1, result);

        for (Integer integer: result) {
            System.out.print(integer + " ");
        }
    }
}