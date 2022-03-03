package linkedlist;

public class Main {
    public static void main(String[] args) {

        LL list = new LL();
        list.insertFirst(15);
        list.insertFirst(11);
        list.insertFirst(8);
        list.insertFirst(5);

        list.insertLast2(100);

        list.insert(69,3);
        list.display();
    }
}