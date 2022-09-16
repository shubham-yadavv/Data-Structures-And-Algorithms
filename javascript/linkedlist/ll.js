"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
class Node {
    constructor(value, next) {
        this.value = value;
        this.next = null;
    }
}
class LinkedList {
    inserFirst(val) {
        let node = new Node(val, null);
        node.next = this.head;
        this.head = node;
        if (this.tail == null) {
            this.tail = this.head;
        }
        this.size++;
    }
    insertLast(val) {
        if (this.tail == null) {
            this.inserFirst(val);
            return;
        }
        let node = new Node(val, null);
        this.tail.next = node;
        this.tail = node;
        this.size++;
    }
    insertAt(val, index) {
        if (index == 0) {
            this.inserFirst(val);
            return;
        }
        if (index == this.size) {
            this.insertLast(val);
            return;
        }
        // temp node
        let temp = this.head;
        for (let i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        let node = new Node(val, null);
        temp.next = node;
        this.size++;
    }
    //print 
    print() {
        let current = this.head;
        while (current) {
            console.log(current.value);
            current = current.next;
        }
    }
}
let list = new LinkedList();
list.inserFirst(6);
list.inserFirst(5);
list.inserFirst(3);
list.insertLast(1);
list.print();
