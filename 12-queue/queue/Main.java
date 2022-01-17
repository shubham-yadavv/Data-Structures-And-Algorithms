import java.util.Scanner;

class Queue{
    int max = 10;
    int front = -1;
    int rear = -1;
    int[] arr = new int[max];

    void enqueue(int x){    //add an element to the rear of the queue
        if(rear == max - 1){
            System.out.println("Queue is full");
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear++;
        arr[rear] = x;
    }

     int dequeue(){          //return the front element and remove it from the queue
        if(front == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        int x = arr[front];
        front++;
        if(front > rear){
            front = rear = -1;
        }
        return x;
    }

    int front(){             //return the front element
        if(front == -1){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    void display(){         //display the queue
        if(front == -1){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = front; i <= rear; i++){
            System.out.print(arr[i] + " ");
        }
    }

}

public class Main {
    public static void main(String[] args) {
       int choice, x;
       Queue q = new Queue();
       Scanner sc = new Scanner(System.in);
       do{
           System.out.println("1. Enqueue");
           System.out.println("2. Dequeue");
           System.out.println("3. Display");
           System.out.println("4. Exit");
           System.out.println("Enter your choice");
           choice = sc.nextInt();
           switch(choice){
               case 1:
                   System.out.println("Enter the element to be enqueued");
                   x = sc.nextInt();
                   q.enqueue(x);
                   break;
               case 2:
                   x = q.dequeue();
                   if(x != -1){
                       System.out.println("Dequeued element is " + x);

                   }
                   break;
               case 3:
                   q.display();
                   System.out.println();
                   break;
               case 4:
                   System.out.println("Exiting");
                   break;
               default:
                   System.out.println("Wrong choice");

           }
       }    while(choice != 4);
    }
}

