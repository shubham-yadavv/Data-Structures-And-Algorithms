"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const node_1 = __importDefault(require("./node"));
class LinkedList {
    insertFirst(val) {
        let node = new node_1.default(val);
        node.next = this.head;
        this.head = node;
        if (this.tail == null) {
            this.tail = this.head;
        }
        this.size++;
    }
    insertLast(val) {
        if (this.tail == null) {
            this.insertFirst(val);
            return;
        }
        let node = new node_1.default(val);
        this.tail.next = node;
        this.tail = node;
        this.size++;
    }
    // insert at index
    insertAt(val, index) {
        if (index == 0) {
            this.insertFirst(val);
            return;
        }
        if (index == this.size) {
            this.insertLast(val);
            return;
        }
        let node = new node_1.default(val);
        let temp = this.get(index - 1);
        node.next = temp.next;
        temp.next = node;
        this.size++;
    }
    deleteFirst() {
        let val = this.head.val;
        if (this.head == null) {
            return;
        }
        this.head = this.head.next;
        this.size--;
        return val;
    }
    deleteLast() {
        let val = this.tail.val;
        if (this.size <= 1) {
            this.deleteFirst();
        }
        let secondlast = this.get(this.size - 2);
        this.tail = secondlast;
        this.tail.next = null;
        return val;
    }
    deleteAt(index) {
        if (index == 0) {
            this.deleteFirst();
        }
        if (index === this.size - 1) {
            this.deleteLast();
        }
        let prev = this.get(index - 1);
        let val = prev.next.val;
        prev.next = prev.next.next;
        this.size--;
        return val;
    }
    get(index) {
        let temp = this.head;
        for (let i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    display() {
        let temp = this.head;
        while (temp != null) {
            console.log(temp.val);
            console.log("|");
            temp = temp.next;
        }
        console.log("null");
    }
}
let list = new LinkedList();
list.insertFirst(15);
list.insertFirst(11);
list.insertFirst(8);
list.insertFirst(5);
list.insertLast(100);
list.insertAt(69, 0);
list.display();
