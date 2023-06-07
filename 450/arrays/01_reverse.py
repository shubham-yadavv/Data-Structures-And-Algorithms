# approach 1 : iterative
# Time complexity: O(n)
# Space complexity: O(1)
def reverse(arr, start, end):
    while start < end:
        arr[start], arr[end] = arr[end], arr[start]
        start = start + 1
        end = end - 1
    return arr

# approach 2 : recursive
# Time complexity: O(n)
# Space complexity: O(n)
def reverse2(arr, start, end):
    if start > end:
        return
    reverse2(arr, start+1, end - 1)
    return arr


arr = [1, 2, 3, 4, 5]
print(reverse(arr, 0, len(arr) - 1))
print(reverse2(arr, 0, len(arr)-1))


# time comeplexities from shortest to longest
# O(1) < O(log n) < O(n) < O(n log n) < O(n^2) < O(2^n) < O(n!)

# space complexities from shortest to longest
# O(1) < O(log n) < O(n) < O(n log n) < O(n^2) < O(2^n) < O(n!)