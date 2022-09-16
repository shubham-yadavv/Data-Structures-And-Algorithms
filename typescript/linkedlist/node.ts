class Node {
  val: number;
  next: Node;
  prev: Node
  constructor(val: number) {
    this.val = val;
    this.next = null;
  }
}

export default Node;