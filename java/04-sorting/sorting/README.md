### bubble sort
1. compare adjacent elements
2. swap if they are not in order
3. repeat until the array is sorted
4. return the sorted array

time complexity: 
* best: O(n)
* average: O(n^2)
* worst: O(n^2)

space complexity: O(1)



### Insertion sort
1. pick the first element
2. compare it with the elements before it
3. swap if it is in the wrong order
4. repeat until the array is sorted
5. return the sorted array

time complexity: 
* best: O(n)
* average: O(n^2)
* worst: O(n^2)
    
space complexity: O(1)


### Merge sort
1. divide the array in 2 parts
2. get both parts sorted 
3. merge the two sorted parts. 

divide and conquer
recursive

time complexity: 
* best: O(n log n)
* average: O(n log n)
* worst: O(n log n)

space complexity: O(n)


### Quick sort
1. pick a pivot element
2. partition the array around the pivot element
3. recursively sort the two subarrays
4. return the sorted array

time complexity: 
* best case: O(n log n)
* average case: O(n log n)
* worst case: O(n^2)

space complexity: O(n)
