package linkedlist;

public class CLL {

    private Node head = null;
    private Node tail = null;


    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public Node addAfter(int data, int item) {
        if (head == null) {
            return null;
        }

        Node p;
        p = head.next;
        do {
            if (p.data == item) {

                Node node = new Node(data);

                node.next = p.next;

                p.next = node;

                if (p == head) {
                    head = node;
                }
                return head;
            }
            p = p.next;
        } while (p != head.next);

        System.out.println(item + "The given node is not present in the list");
        return head;

    }


    public void delete(int data) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.data == data) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.data == data) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.data + " -> ");
                if (node.next != null) {
                    node = node.next;
                }
            } while (node != head);
        }
        System.out.println("HEAD");
    }



    private class Node {
        int data;
        Node next;

        public Node(int val) {
            this.data = val;
        }
    }

}