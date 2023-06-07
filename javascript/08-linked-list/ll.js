class Node {
    constructor( value ) {
        this.value = value;
    }

    constructor( value, next ) {
        this.value = value;
        this.next = next;
    }
}


class Linkedlist{
    constructor() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    insertFirst( value ) {
        const node = new Node( value, this.head );
        node.next = this.head;
        this.head = node;

        if ( !this.tail ) {
            this.tail = node;
        }

        this.size++;


    }

}

