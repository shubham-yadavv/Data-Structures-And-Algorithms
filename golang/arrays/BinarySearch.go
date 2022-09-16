package main

import (
	"fmt"
)

func binarySearch(arr []int, target int) int {
	start := 0
	end := len(arr) - 1
	for start <= end {
		mid := start + (end-start)/2
		if target < arr[mid] {
			end = mid - 1
		}
		if target > arr[mid] {
			start = mid + 1
		}
		if target == arr[mid] {
			return mid
		}
	}
	return -1
}

func main() {
	arr := []int{1, 2, 3, 4, 5, 6, 7, 8, 9}
	fmt.Println(binarySearch(arr, 5))
}
