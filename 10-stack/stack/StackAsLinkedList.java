class StackUsingLinkedlist {

    private class Node {

        int data;
        Node next;
    }
    Node top;
    StackUsingLinkedlist()
    {
        this.top = null;
    }

    public void push(int x)
    {
        Node node = new Node();

        if (node == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        node.data = x;
        node.next = top;

        top = node;
    }
    public boolean isEmpty()
    {
        return top == null;
    }

    public int peek()
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void pop()
    {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        top = (top).next;
    }

    public void display()
    {
        if (top == null) {
            System.out.printf("\nStack Underflow");

        }
        else {
            Node temp = top;
            while (temp != null) {

                System.out.printf("->", temp.data);

                temp = temp.next;
            }
        }
    }
}
public class StackAsLinkedList {
    public static void main(String[] args)
    {
        StackUsingLinkedlist obj = new StackUsingLinkedlist();
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

        obj.display();

        System.out.printf("\nTop element is %d\n", obj.peek());

        obj.pop();
        obj.pop();

        obj.display();

        System.out.printf("\nTop element is %d\n", obj.peek());
    }
}
