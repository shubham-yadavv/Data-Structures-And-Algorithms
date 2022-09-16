package main

import (
	"fmt"
)

func max(arr []int) int {
	max := arr[0]
	for _, val := range arr {
		if val > max {
			max = val
		}
	}
	return max
}

func maxRange(arr []int, start int, end int) int {
	if start > end {
		return -1

	}

	if arr == nil {
		return -1
	}

	maxVal := arr[start]
	for i := start; i <= end; i++ {
		if arr[i] > maxVal {
			maxVal = arr[i]
		}
	}

	return maxVal

}

func main() {
	arr := []int{1, 3, 2, 18, 3, 4, 65}
	fmt.Print(max(arr))
	fmt.Println()
	fmt.Print(maxRange(arr, 0, 3))

}
