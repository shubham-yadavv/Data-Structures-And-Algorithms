public class Main{
    public static void main(String[] args) {

//        LL list = new LL();
//        list.insertFirst(15);
//        list.insertFirst(11);
//        list.insertFirst(8);
//        list.insertFirst(5);
//        list.insertLast(100);
//
//        list.insert(69,0);
//        list.display();


        DLL dl = new DLL();
        dl.insertFirst(15);
        dl.insertFirst(11);
        dl.insertFirst(8);
        dl.insertFirst(5);
        dl.insertLast(100);

        dl.insert(3,69);
        dl.display();
//
//        CLL list = new CLL();
//        list.insert(3);
//        list.insert(7);
//        list.insert(4);
//        list.insert(69);
//        list.addafter(100, 7);
//        list.display();
//        list.delete(69);
//        list.display();


    }
}