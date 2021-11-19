package linked_list;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail==null){
            tail = head;
        }
        size += 1;
    }
    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next= node;
        tail = node;
        size++;
    }

    public void insert(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
        
    }

    public void display(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.value + "->");
            temp = temp.next;

        }
        System.out.println("END");
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }



//    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(8);
//        list.insertFirst(32);
//        list.insertFirst(5);
//        list.insertFirst(92);
//
//
//        list.insertLast(9);
//        list.insertLast(3);
//        list.insertLast(87);
//
//        list.display();
//
//    }
}


