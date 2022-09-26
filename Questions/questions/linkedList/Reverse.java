
public class Reverse {

    private Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;

        }
    }

    Node reverse(Node node) {

        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    Node reverseRecursion(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node rest = reverseRecursion(node.next);
        node.next.next = node;
        node.next = null;
        return rest;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {

        Reverse list = new Reverse();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);

        System.out.println("Given Linked list");
        list.printList(list.head);
        // list.head = list.reverse(list.head);
        list.head = list.reverseRecursion(list.head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(list.head);
    }

}
