def union(arr1, len_of_arr1, arr2, len_of_arr2):
    union = set()
    for i in range(len_of_arr1):
        union.add(arr1[i])

    for i in range(len_of_arr2):
        union.add(arr2[i])

    print("union: ", union)

    

def intersection(arr1, len_of_arr1, arr2, len_of_arr2):
    intersection = set()
    for i in range(len_of_arr1):
        for j in range(len_of_arr2):
            if arr1[i] == arr2[j]:
                intersection.add(arr1[i])

    print("intersection: ", intersection)


def main():
    arr1 = [1, 2, 3, 4, 5, 6]
    arr2 = [1, 2, 3, 6]

    print("array1", arr1, "array2" , arr2)
    union(arr1, len(arr1), arr2, len(arr2))
    intersection(arr1, len(arr1), arr2, len(arr2))


if __name__ == "__main__":
    main()
