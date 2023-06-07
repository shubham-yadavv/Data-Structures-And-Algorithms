def max(arr):
    current_max = arr[0]
    for index in range(1, len(arr)):
        if arr[index] > current_max:
            current_max = arr[index]
    return current_max


def max_range(arr, start, end):
    if start > end:
        return -1

    current_max = arr[start]
    for index in range(start, end +1):
        if arr[index]> current_max:
            current_max = arr[index]
    
    return current_max

arr = (1, 3, 2, 9, 18)
print(max(arr=arr))
print(max_range(arr=arr, start=0, end=2))
