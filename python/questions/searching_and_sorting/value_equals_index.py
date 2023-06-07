# Find a Fixed Point (Value equal to index) in a given array	

def value_equalto_index1(arr, n):
    res=[]
    for i in range(n):
        if arr[i]==i+1:
            res.append(arr[i])
    return res



if __name__ == "__main__":
    arr = [15, 2, 45, 12, 7]
    n = len(arr)
    print(value_equalto_index1(arr, n))

