// reverse a linked list

package main

import "fmt"

type Node struct {
	data int
	next *Node
}

func reverse(head *Node) {
	var prev *Node
	current := head
	for current != nil {
		next := current.next
		current.next = prev
		prev = current
		current = next
	}
	head = prev
}

func reverseRecursion(head *Node) *Node {
	if head == nil || head.next == nil {
		return head
	}
	rest := reverseRecursion(head.next)
	head.next.next = head
	head.next = nil
	return rest
}

func printList(head *Node) {
	for head != nil {
		fmt.Print(head.data, " ")
		head = head.next
	}
	fmt.Println()
}

func main() {
	head := &Node{data: 1}
	head.next = &Node{data: 2}
	head.next.next = &Node{data: 3}
	head.next.next.next = &Node{data: 4}
	head.next.next.next.next = &Node{data: 5}
	head.next.next.next.next.next = &Node{data: 6}

	fmt.Println("Original linked list")
	printList(head)

	reverse(head)
	fmt.Println("Reversed linked list")
	printList(head)

}
