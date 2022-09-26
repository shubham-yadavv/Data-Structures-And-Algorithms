package main

import "fmt"

func main() {
	arr := []int{1, 2, 53, 4, 5, 6}
	fmt.Println(arr)
	min, max := findMinMax(arr)
	fmt.Println("min: ", min, "max: ", max)
}

func findMinMax(arr []int) (int, int) {
	min := arr[0]
	max := arr[0]
	for i := 1; i < len(arr); i++ {
		if arr[i] < min {
			min = arr[i]
		}
		if arr[i] > max {
			max = arr[i]
		}
	}
	return min, max
}
