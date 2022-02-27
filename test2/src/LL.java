public class LL {
    Node head;
    Node tail;

    public void insertFirst(int val){   // function to insert node at first position
        Node node = new Node(val);

        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }

    }

    public void insertLast(int val){   // function to insert node at last position
        if (tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
    }

    public void display(){    // function to display linked list
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp =temp.next;
        }
        System.out.println("NULL");
    }

    private class Node{     // class to create a node which has 2 properties value and ref. variable
        int value;
        Node next;

        public Node(int value){   // function to create a node
            this.value = value;
        }
    }
}



