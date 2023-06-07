# search in range

def search_in_range(arr, target, start, end):
    if len(arr) == 0:
        return -1
    
    for i in range(start, end + 1):
        if arr[i] == target:
            return i
    return -1

arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
print(search_in_range(arr, 8, 0, 5))
