
# approach 4: quick select
# Time complexity: O(n) on average, O(n^2) worst case
# Space complexity: O(1)


def kth_smallest(arr: list, left: int, right: int, k: int) -> int:
    if k > 0 and k <= right - left + 1:
        pos = partition(arr, left, right)
        if pos - left == k - 1:
            return arr[pos]
        if pos - left > k - 1:
            return kth_smallest(arr, left, pos - 1, k)
        return kth_smallest(arr, pos + 1, right, k - pos + left - 1)
    return 999999999999

def partition(arr: list, left: int, right: int) -> int:
    x = arr[right]
    i = left
    for j in range(left, right):
        if arr[j] <= x:
            swap(arr, i, j)
            i += 1
    swap(arr, i, right)
    return i


def swap(arr, a, b):
    arr[a], arr[b] = arr[b], arr[a]

if __name__ == "__main__":
    arr = [7, 10, 4, 3, 20, 15]
    n = len(arr)
    k = 2
    print(kth_smallest(arr, 0, n-1, k))

