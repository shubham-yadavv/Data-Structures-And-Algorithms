package bst;

import java.util.Scanner;

public class Main {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }

    }

    public Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        }
        else if (data <= root.data) {
            root.left = insert(root.left, data);
        }
        else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public boolean search(Node root, int data) {
        if(root == null) {
            return false;
        }
        else if (root.data == data) {
            return true;
        }
        else if (data <= root.data) {
            return search(root.left, data);
        }
        else {
            return search(root.right, data);
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        Node root = null;
        root = tree.insert(root, 50);
        root = tree.insert(root, 30);
        root = tree.insert(root, 20);
        root = tree.insert(root, 40);
        root = tree.insert(root, 70);

        int num;
        System.out.println("Enter the number to search");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if(tree.search(root, num)) {
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }

    }

}
