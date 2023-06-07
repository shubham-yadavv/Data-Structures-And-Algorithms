def sum_of_subarray(arr, n):
    max_sum = 0
    for i in range(n):
        current_sum = 0
        for j in range(i, n):
            current_sum += arr[j]
            if current_sum > max_sum:
                max_sum = current_sum
    return max_sum


if __name__ == "__main__":
    arr = [-5, 4 ,6, -3, 4, -1]
    n = len(arr)
    print(sum_of_subarray(arr, n))

