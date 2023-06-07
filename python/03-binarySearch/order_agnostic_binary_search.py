def order_agnostic_binary_search(arr, target ):
    start = 0
    end = len(arr) -1

    is_ascending = arr[start] < arr[end]

    while start <= end:
        mid: int = start + (end - start) //2

        if arr[mid] == target:
            return mid

        if is_ascending:
            if arr[mid] < target:
                start = mid + 1
            else:
                end = mid -1
        else:
            if arr[mid] < target:
                end = mid -1
            else:
                start = mid +1
    return -1


if __name__ == "__main__":
    arr = [31, 21, 19, 15, 12, 11]
    target = 19
    print(order_agnostic_binary_search(arr, target))
