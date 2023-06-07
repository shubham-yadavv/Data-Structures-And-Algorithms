# implementaion of 2d arrays in python

arr = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

# accessing an element in a 2d array
print("Element at index 0, 1: ", arr[0][1])

# updating an element in a 2d array
arr[1][1] = 10
print("Updated array: ", arr)


# deleting an element in a 2d array
del arr[0][0]
print("array after deleting an element: ", arr)


# printing the length of the array
print("Length of the array: ", len(arr))


# traversing the 2d array
for i in range(len(arr)):
    for j in range(len(arr[i])):
        print(arr[i][j])

# searching an element in a 2d array
for i in range(len(arr)):
    for j in range(len(arr[i])):
        if arr[i][j] == 4:
            print("Element found at index", i, j)

            

