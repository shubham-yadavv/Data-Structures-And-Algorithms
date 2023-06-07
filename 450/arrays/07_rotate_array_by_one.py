def rotate1(arr, n):
    x = arr[n-1]
    for i in range(n-1, 0, -1):  # range(start, stop, step)
        arr[i] = arr[i-1]
    arr[0] = x
    return arr


def rotate2(arr, n):
    i = 0
    j = n - 1
    while i != j:
        arr[i], arr[j] = arr[j], arr[i]
        i += 1
    return arr


def main():
    arr = [1, 2, 3, 4, 5]
    print("array before rotation: ", arr)
    # print("array after rotation: ", rotate1(arr, len(arr)))
    print("array after rotation: ", rotate2(arr, len(arr)))


if __name__ == "__main__":
    main()
