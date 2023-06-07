# find numbers with even number of digits

def find_numbers(nums):
    count = 0
    for i in nums:
        if len(str(i)) % 2 == 0:
            count += 1
    return count

nums = [12, 345, 2, 6, 7896]
print(find_numbers(nums))


