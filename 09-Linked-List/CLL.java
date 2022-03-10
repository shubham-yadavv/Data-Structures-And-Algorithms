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
        if (head == null)
            return null;

        Node newNode, p;
        p = head.next;
        do {
            // if the item is found, place newNode after it
            if (p.data == item) {
                // allocate memory to the new node
                newNode = new Node(data);


                // make the next of the current node as the next of newNode
                newNode.next = p.next;

                // put newNode to the next of p
                p.next = newNode;

                // if p is the last node, make newNode as the last node
                if (p == head)
                    head = newNode;
                return head;
            }
            p = p.next;
        } while (p != head.next);

        System.out.println(item + "The given node is not present in the list");
        return head;

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

    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.data == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.data == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }

    private class Node {
        int data;
        Node next;

        public Node(int val) {
            this.data = val;
        }
    }

    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(1);
        list.insert(2);
        list.insert(4);
        list.insert(5);
        list.addAfter(100, 2);


        list.display();
    }
}