class Node{
    constructor(data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{

    // iterative approach
    reverseList(head){
        let prev = null;
        let current = head;
        let next = null;

        while(current){ 
            next = current.next; 
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

   

    printList(head){
        let current = head;
        let result = [];
        while(current){
            result.push(current.data);
            current = current.next;
        }
        return result;
    }



}

let list = new LinkedList();
let head = new Node(1);
head.next = new Node(2);
head.next.next = new Node(3);
head.next.next.next = new Node(4);


console.log(list.printList(head));
console.log(list.printList(list.reverseList(head)));