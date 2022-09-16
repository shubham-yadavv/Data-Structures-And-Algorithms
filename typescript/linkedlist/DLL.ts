import Node from "./node";

class DLL {
  private head: Node;

  public insertFirst(val: number): void {
    let node: Node = new Node(val);

    node.next = this.head;
    node.prev = null;
    if (this.head != null) {
      this.head.prev = node;
    }
    this.head = node;
  }

    public insertLast(val: number): void {
    let node: Node = new Node(val);
    let current: Node = this.head;
    if (this.head == null) {
        this.insertFirst(val);
        return;
    }
    while (current.next != null) {
        current = current.next;
    }
    current.next = node;
    node.prev = current;
    }
    

  public display(): void{
    let current: Node = this.head;
    while(current != null){
      console.log(current.val);
      current = current.next;
    }
  }


    public displayReverse(): void{
    let current: Node = this.head;
    while(current.next != null){
      current = current.next;
    }
    while(current != null){
      console.log(current.val);
      current = current.prev;
    }
  }


}

let dl = new DLL();
dl.insertFirst(15);
dl.insertFirst(12);
dl.insertFirst(19);
dl.display();
console.log("Reverse");

dl.displayReverse()