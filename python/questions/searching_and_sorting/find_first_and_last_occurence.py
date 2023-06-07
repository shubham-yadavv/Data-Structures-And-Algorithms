# find first and last occurence of a number in a sorted array

def find_first_and_last_occurence1(arr, length_of_arr, target):
    first_occurence = -1
    last_occurence = -1
    for index in range(length_of_arr):
        if target != arr[index]:
            continue
        if first_occurence == -1:
            first_occurence = index
        last_occurence = index
    return first_occurence, last_occurence


# approach 2: binary search
def find_first_and_last_occurence2(arr, length_of_arr, target):
    start = 0
    end = length_of_arr - 1
    first_occurence = -1
    last_occurence = -1
    while start <= end:
        mid = (start + end) // 2
        if arr[mid] == target:
            first_occurence = mid
            end = mid - 1
        elif arr[mid] > target:
            end = mid - 1
        else:
            start = mid + 1
    start = 0
    end = length_of_arr - 1
    while start <= end:
        mid = (start + end) // 2
        if arr[mid] == target:
            last_occurence = mid
            start = mid + 1
        elif arr[mid] > target:
            end = mid - 1
        else:
            start = mid + 1
    return first_occurence, last_occurence


if __name__ == "__main__":
    arr = [1, 2, 2, 2, 2, 3, 4, 7, 8, 8]
    length_of_arr = len(arr)
    target = 2
    print(find_first_and_last_occurence1(arr, length_of_arr, target))
    print(find_first_and_last_occurence2(arr, length_of_arr, target))
