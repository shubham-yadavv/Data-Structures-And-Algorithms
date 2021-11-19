package linked_list;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(8);
        list.insertFirst(32);
        list.insertFirst(5);
        list.insertFirst(92);
        list.insertLast(9);
        list.insertLast(3);
        list.insertLast(87);
        list.insert(22,3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}