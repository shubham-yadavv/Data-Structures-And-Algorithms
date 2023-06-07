# time complexity : O(n)
# space complexity : O(1)

def sort(arr, n):
    count0 = 0
    count1 = 0
    count2 = 0

    for i in range(n):
        if arr[i] == 0:
            count0+=1
        elif arr[i] ==1:
            count1 +=1
        else:
            count2 +=1

    i = 0
    while count0 > 0:
        arr[i] = 0
        i+=1
        count0-=1

    while count1 > 0:
        arr[i] = 1
        i+=1
        count1-=1
        
    while count2 > 0:
        arr[i] = 2
        i+=1
        count2-=1

    return arr


arr = [0, 1, 2, 0, 1, 2]
n = len(arr)
print(sort(arr, n))