def binary_search(arr, target):
    start = 0
    end = len(arr) -1
    while start <= end:
        mid = (start + end) // 2
        if arr[mid] < target:
            start = mid + 1
        elif arr[mid] > target:
            end = mid -1
        else:
            return mid
    return -1


if __name__ == "__main__":
    arr = [12, 24, 13, 40, 35, 26]
    target = 13
    print(binary_search(arr, target))

