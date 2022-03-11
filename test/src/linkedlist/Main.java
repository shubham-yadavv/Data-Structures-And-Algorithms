package linkedlist;

public class Main {
    public static void main(String[] args) {

//        LL list = new LL();
//        list.insertFirst(15);
//        list.insertFirst(11);
//        list.insertFirst(8);
//        list.insertFirst(5);
//
//        list.insert(69, 1);
//        list.display();
//
//        System.out.println(list.delete(1));
//        list.display();
//
//        DLL dl = new DLL();
//        dl.insertFirst(3);
//        dl.insertFirst(9);
//        dl.insertFirst(8);
//        dl.insertFirst(6);
//        dl.insert(9, 7);
//        dl.display();

        CLL list = new CLL();
        list.insert(3);
        list.insert(7);
        list.insert(4);
        list.insert(69);
        list.addafter(100, 7);
        list.display();
        list.delete(69);
        list.display();
    }
}