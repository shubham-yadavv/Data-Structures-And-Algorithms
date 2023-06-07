# approach: 1. sort the array and return first and last element
# time complexity: O(n log n)
# space complexity: O(1)
def get_min_max(arr: list, n: int) -> tuple:
	arr.sort()
	return (arr[0], arr[n-1])


# approach 2: linear search
# Time complexity: O(n) 
# Space complexity: O(1)
class pair:
	def __init__(self): 
		self.max = 0
		self.min = 0

def get_min_max2(arr: list, n: int) -> pair:
	min_max = pair() 

	# If there is only one element then return it as min and max both
	if n == 1:
		min_max.max = arr[0]
		min_max.min = arr[0]
		return min_max

	# If there are more than one elements, then initialize min and max
	if arr[0] > arr[1]:
		min_max.max = arr[0]
		min_max.min = arr[1]
	else:
		min_max.max = arr[1]
		min_max.min = arr[0]


	for i in range(2, n):
		if arr[i] > min_max.max:
			min_max.max = arr[i]
		elif arr[i] < min_max.min:
			min_max.min = arr[i]

	return min_max



def main():
	arr = [1000, 11, 445, 1, 330, 3000]
	arr_size = len(arr)
	result = get_min_max2(arr, arr_size)
	print(result.min, result.max)
	print(get_min_max(arr, arr_size))

if __name__ == "__main__":
	main()