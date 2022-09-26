package main

import "fmt"

func main() {
	arr := []int{8, 4, 2, 1, 3, 5, 6, 7}
	fmt.Println(arr)
	k := 4
	fmt.Println(kthMax(arr, k))
}

func kthMax(arr []int, k int) int {
	for i := 0; i < k; i++ {
		for j := i + 1; j < len(arr); j++ {
			if arr[i] < arr[j] {
				arr[i], arr[j] = arr[j], arr[i]
			}
		}
	}
	return arr[k-1]
}
