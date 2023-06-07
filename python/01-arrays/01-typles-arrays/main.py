# tuples(arrays) are imutable that means it can not be changes or assigned
array = (1, 2, 3, 4, 5) 

# print the array
print(array)

# array[1] = 10 # gives error because tuple is immutable and cannot be changed

# access the element of the array
print("element at index 1 is" , array[1])

# print the length of the array
print("length of the array is",len(array))

# print the type of the array
print("type of the array is ", type(array))


# print the last element of the array
print("last element of the arrays is ", array[-1])
print("second last element of the arrays is ", array[-2])