import Node from "./node";

class LL {
  private head: Node;
  private tail: Node;
  private size: number = 0;

  public insertFirst(val: number): void {
    let node = new Node(val);
    node.next = this.head;
    this.head = node;

    if (this.tail == null) {
      this.tail = this.head;
    }
    this.size++;
  }

  public insertLast(val: number): void {
    if (this.tail == null) {
      this.insertFirst(val);
      return;
    }

    let node = new Node(val);
    this.tail.next = node;
    this.tail = node;
    this.size++;
  }

  // insert at index
  public insertAt(val: number, index: number): void {
    if (index == 0) {
      this.insertFirst(val);
      return;
    }

    if (index == this.size) {
      this.insertLast(val);
      return;
    }

    let node = new Node(val);
    let temp = this.get(index - 1);
    node.next = temp.next;
    temp.next = node;
    this.size++;
  }

  public deleteFirst(): number {
    let val: number = this.head.val;
    if (this.head == null) {
      return;
    }

    this.head = this.head.next;
    this.size--;
    return val;
  }

  public deleteLast(): number{
    let val: number = this.tail.val;

    if(this.size<=1){
        this.deleteFirst();
    }
    
    let secondlast: Node = this.get(this.size -2)
    this.tail = secondlast;
    this.tail.next = null
    
    return val;
  }

    public deleteAt(index: number): number {
      if (index == 0) {
        this.deleteFirst();
      }

      if (index === this.size - 1) {
        this.deleteLast();
      }

      let prev: Node = this.get(index - 1);
      let val: number = prev.next.val;
      prev.next = prev.next.next;
      this.size--;
      return val;
    }

  public get(index: number): Node {
    let temp = this.head;
    for (let i = 0; i < index; i++) {
      temp = temp.next;
    }
    return temp;
  }

  public display(): void {
    let temp = this.head;
    while (temp != null) {
      console.log(temp.val);
      console.log("|");
      temp = temp.next;
    }

    console.log("null");
  }
}

export default LL;