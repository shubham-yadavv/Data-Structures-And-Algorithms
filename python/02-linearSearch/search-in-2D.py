# search in 2D array

def search(arr, target):
    for row in range(len(arr)):
        for col in range(len(arr[row])):
            if arr[row][col] == target:
                return [row, col]
    return [-1, -1]


arr = [[1, 2, 3], 
       [4, 5, 6],
         [7, 8, 9]]
print(search(arr, 8))

