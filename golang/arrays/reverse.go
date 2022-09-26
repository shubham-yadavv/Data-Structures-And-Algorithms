package main

import "fmt"

func main() {
	arr := []int{1, 2, 3, 4, 5, 6}
	fmt.Println(arr)
	// reverse(arr, 0, len(arr)-1)
	// fmt.Println(arr)
	reverseRecursion(arr, 0, len(arr)-1)
	fmt.Println(arr)

}

func reverse(arr []int, start int, end int) {
	for start < end {
		arr[start], arr[end] = arr[end], arr[start]
		start++
		end--
	}

}

// reverse using recursion
func reverseRecursion(arr []int, start int, end int) {
	if start >= end {
		return
	}
	arr[start], arr[end] = arr[end], arr[start]
	reverseRecursion(arr, start+1, end-1)
}
