// linked list in golang

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

// class
func (l *LinkedList) Add(data int) {
	newNode := &Node{data: data}
	if l.head == nil {
		l.head = newNode
	} else {
		l.tail.next = newNode
	}
	l.tail = newNode
	l.size++
}

func (l *LinkedList) Remove(data int) {
	if l.head == nil {
		return
	}
	if l.head.data == data {
		l.head = l.head.next
		l.size--
		return
	}
	current := l.head
	for current.next != nil {
		if current.next.data == data {
			current.next = current.next.next
			l.size--
			return
		}
		current = current.next
	}
}

func (l *LinkedList) Contains(data int) bool {
	if l.head == nil {
		return false
	}
	current := l.head
	for current != nil {
		if current.data == data {
			return true
		}
		current = current.next
	}
	return false
}

func (l *LinkedList) Print() {
	current := l.head
	for current != nil {
		fmt.Printf("%d ", current.data)
		current = current.next
	}
	fmt.Println()
}

func main() {
	l := &LinkedList{}
	l.Add(1)
	l.Add(2)
	l.Add(3)
	l.Add(4)
	l.Add(5)
	l.Print()
	l.Remove(3)
	l.Print()
	fmt.Println(l.Contains(3))
	fmt.Println(l.Contains(4))
}
