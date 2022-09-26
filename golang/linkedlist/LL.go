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

func (l *LinkedList) deleteFirst() int {
	var value int = l.head.data
	if l.head == nil {
		return -1
	}

	l.head = l.head.next
	l.size--
	return value

}

func (l *LinkedList) deleteLast() int {
	var val int = l.tail.data
	if l.size <= 1 {
		l.deleteFirst()
	}
	var secondlast *Node = l.get(l.size - 2)
	l.tail = secondlast
	l.tail.next = nil

	l.size--

	return val

}

func (l *LinkedList) deleteAt(index int) int {
	if index < 0 || index >= l.size {
		fmt.Println("Index out of bounds")
		return -1
	}

	if index == 0 {
		return l.deleteFirst()
	}

	if index == l.size-1 {
		return l.deleteLast()
	}

	prev := l.get(index - 1)
	value := prev.next.data
	prev.next = prev.next.next
	l.size--
	return value
}

func (l *LinkedList) get(index int) *Node {
	temp := l.head
	for i := 0; i < index; i++ {
		temp = temp.next
	}

	return temp

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
	ll := &LinkedList{}
	ll.insertFirst(1)
	ll.insertFirst(2)
	ll.insertFirst(3)
	ll.insertFirst(4)
	ll.insertFirst(5)
	ll.insertLast(6)
	ll.insertAt(7, 2)

	ll.deleteFirst()
	ll.deleteLast()
	ll.deleteAt(2)
	ll.printList()
}
