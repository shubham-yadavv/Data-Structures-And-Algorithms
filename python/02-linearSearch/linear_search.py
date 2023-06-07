def linear_search(arr, target):
    for i in range(0, len(arr)):
        if arr[i] == target:
            return i
    return -1

if __name__ == "__main__":
    arr = [1, 2, 3, 4, 5, 6]
    target = 4
    ans = linear_search(arr, target)
    print("target found at index: ", ans)

