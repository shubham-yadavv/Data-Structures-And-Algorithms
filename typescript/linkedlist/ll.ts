class Node {
    value: number;
    next: Node;
    constructor(value: number) {
        this.value = value;
        this.next = null;
    }

}

class LinkedList {
    head: Node;
    tail: Node;
    size: number;

    public inserFirst(val: number): void {

          let node= new Node(val);
          node.next = this.head;
          this.head = node;

          if(this.tail == null){
                this.tail = this.head;

          }
          this.size++;
        
    }

    public insertLast(val: number): void {
        if(this.tail == null){
            this.inserFirst(val);
            return;
        }

        let node = new Node(val);
        this.tail.next = node;
        this.tail = node;
        this.size++;
    }


    public insertAt(val: number, index: number): void {
        if(index  == 0){
            this.inserFirst(val);
            return;
        }
        if(index == this.size){
            this.insertLast(val);
            return;
        }

        // temp node
        let temp: Node = this.head;
        for(let i = 0; i < index - 1; i++){
            temp = temp.next;
        }
        let node = new Node(val);
        temp.next = node;
        this.size++;

    }
        

    //print 
    public print(): void {
        let current = this.head;
        while (current) {
            console.log(current.value);
            current = current.next;
        }
    }

    
}

let list = new LinkedList();
list.inserFirst(6)
list.inserFirst(5);
list.inserFirst(3);
list.insertLast(1);


list.print();

export{}

