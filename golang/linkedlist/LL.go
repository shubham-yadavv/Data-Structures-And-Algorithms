package main

import (
	"fmt"
)

type Node struct {
	data int
	next *Node
}

type LinkedList struct {
	head *Node
	tail *Node
	size int
}

func (l *LinkedList) insertFirst(data int) {
	node := &Node{data: data}
	node.next = l.head
	l.head = node

	if l.tail == nil {
		l.tail = l.head
	}

	l.size++
}

func (l *LinkedList) insertLast(data int) {
	if l.tail == nil {
		l.insertFirst(data)
		return
	}

	node := &Node{data: data}
	l.tail.next = node
	l.tail = node
	l.size++
}

func (l *LinkedList) insertAt(data int, index int) {
	if index < 0 || index > l.size {
		fmt.Println("Index out of bounds")
		return
	}

	if index == 0 {
		l.insertFirst(data)
		return
	}

	if index == l.size {
		l.insertLast(data)
		return
	}

	node := &Node{data: data}
	prev := l.head
	for i := 0; i < index-1; i++ {
		prev = prev.next
	}

	node.next = prev.next
	prev.next = node
	l.size++
}

func (l *LinkedList) printList() {

	node := l.head
	for node != nil {
		fmt.Print(node.data)
		fmt.Print("->")
		node = node.next
	}
	fmt.Println("nil")
}

func main() {

	list := LinkedList{}
	list.size = 0

	list.insertFirst(69)
	list.insertAt(2, 1)
	list.insertAt(3, 2)
	list.insertAt(4, 3)
	list.insertAt(5, 4)
	list.insertAt(6, 5)
	list.insertLast(100)

	list.printList()
}
