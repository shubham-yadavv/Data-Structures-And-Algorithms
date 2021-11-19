package linked_list;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(8);
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(9);

        list.display();

    }
}