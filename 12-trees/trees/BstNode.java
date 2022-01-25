import java.util.Scanner;

public class BstNode {
    int data;
    BstNode left;
    BstNode right;
    BstNode root;

    static BstNode GetNewNode(int data){
        BstNode newNode = new BstNode();
        newNode.data = data;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }

    static BstNode Insert(BstNode root, int data){
        if(root == null){
            root = GetNewNode(data);

        }
        else if(data <= root.data){
            root.left = Insert(root.left, data);

        }
        else{
            root.right = Insert(root.right, data);
        }
        return root;

    }

    static boolean Search(BstNode root, int data){
        if(root == null){
            return false;
        }
        else if(data == root.data){
            return true;
        }
        else if(data <= root.data){
            return Search(root.left, data);
        }
        else{
            return Search(root.right, data);
        }
    }


    public static void main(String[] args) {
        BstNode root = null;
        root = Insert(root, 10);
        root = Insert(root, 20);
        root = Insert(root, 30);

        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        number = sc.nextInt();
        if(Search(root, number)){
            System.out.println("Number found");

        }
        else{
            System.out.println("Number not found");
        }

    }

}

