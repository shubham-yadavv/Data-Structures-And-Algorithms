public class Test {
   Node head;

   public Node addFirst(int data) {
      Node newNode = new Node(data);
      newNode.next = head;
      head = newNode;
      return head;
   }

   public void display() {
      Node temp = head;
      while (temp != null) {
         System.out.print(temp.data + " ");
         temp = temp.next;
      }
   }
   class Node {
      int data;
      Node next;

      Node(int data){
         this.data = data;
         this.next = null;
      }
   }

   public static void main(String[] args) {
      Test t = new Test();
      t.head = t.addFirst(1);
      t.head = t.addFirst(2);
      t.head = t.addFirst(3);
      t.head = t.addFirst(4);
      t.head = t.addFirst(5);
      t.display();

   }
}