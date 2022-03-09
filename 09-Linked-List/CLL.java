public class CLL {
    private Node last;

    public Node addEmpty(int data){
        if (last != null){
            return last;
        }

        Node node = new Node(data);
        node.data = data;
        last = node;

        node.next = last;

        return last;

    }

    public Node insertFirst(int data){
        if (last == null){
            return addEmpty(data);
        }

        Node node = new Node(data);

        node.next = last.next;
        last.next = node;

        return last;
    }

    public Node insertLast(int data){
        if (last == null){
            return addEmpty(data);
        }

        Node node = new Node(data);

        node.next = last.next;
        last.next = node;
        last = node;

        return last;

    }

    public Node addAfter(int data, int item){
        if (last == null){
            return null;
        }

        Node p;
        p = last.next;

        do {
            if (p.data == item){
                Node node = new Node(data);

                node.next = p.next;
                p.next = node;

                if (p == last){
                    last = node;
                }
                return last;
            }
            p = p.next;
        }while (p != last.next);

        System.out.println(item + "given node is not present in the list");
        return last;
    }



    public Node deleteNode(int val){
        if (last == null){
            return null;
        }

        if (last.data == val && last.next == last){
            last = null;
            return last;
        }

        Node temp = last;
        Node d;

        if (last.data == val) {
            while (temp.next != last) {
                temp = temp.next;
            }
            temp.next = last.next;
            last = temp.next;
        }

        while (temp.next != last && temp.next.data != val) {
            temp = temp.next;
        }

        if (temp.next.data == val) {
            d = temp.next;
            temp.next = d.next;
        }
        return last;

    }

    public void traverse(Node head) {
        Node temp;
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        temp = head.next;


        do {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }

        while(temp != head.next);

    }

    private class Node{

        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        CLL cl = new CLL();
        cl.addEmpty(5);
        cl.insertFirst(7);
        cl.insertFirst(4);
        cl.insertLast(100);
        cl.addAfter(69, 4);
        cl.traverse(cl.last);
        System.out.println();
        cl.deleteNode(7);
        cl.traverse(cl.last);
    }
}