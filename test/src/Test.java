// Java program to implement
// the above approach
class GFG
{
   static Node head;
   static class Node
   {
      int data;
      Node next;

      public Node(int data)
      {
         this.data = data;
         next = null;
      }
   };

   static Node push( int data)
   {
      Node node = new Node(data);
      node.next = head;
      head = node;
      return head;

   }

   static void printList(Node head)
   {
      Node temp = head;
      if (head != null)
      {
         do
         {
            System.out.print(temp.data + " ");
            temp = temp.next;
         }
         while (temp != head);
      }
   }

   // Driver Code
   public static void main(String args[])
   {
      /* Initialize lists as empty */
      Node head = null;

	/* Created linked list will
	be 11.2.56.12 */
      head = push(12);
      head = push( 56);
      head = push(2);
      head = push( 11);

      System.out.println("Contents of Circular " +
              "Linked List:");
      printList(head);
   }
}

// This code is contributed
// by Arnab Kundu
