Search a sorted array by repeatedly dividing the search interval in half. Begin with an interval covering the whole array.
If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
Otherwise, narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.

### pesudo code :

1. Compare x with the middle element.
2. If x matches with the middle element, we return the mid index.
3. Else If x is greater than the mid element, then x can only lie in the right half subarray after the mid element. So we recur for the right half.
4. Else (x is smaller) recur for the left half.


### Time compelxity : 
 * O(log n)