// approach 1 : create a new array and loop through the array from the end and push the elements to the new array
// Time complexity : O(n)
// Space complexity : O(n)

function reverse(arr) {
  let newArr = [];
  for (let i = arr.length - 1; i >= 0; i--) {
    newArr.push(arr[i]);
  }
  return newArr;
}

// approach 2 : swap the elements from the start and end
// Time complexity : O(n)
// Space complexity : O(1)
function reverse2(arr) {
  let start = 0;
  let end = arr.length - 1;
  while (start < end) {
    let temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
  }

  return arr;
}


// approach 3 : recursive approach
// Time complexity : O(n)
// Space complexity : O(n), because it creates a new stack frame for each recursive call
function reverse3(arr, start, end){
    if(start >= end){
        return arr;
    }
    let temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    return reverse3(arr, start+1, end-1);

}


console.log(reverse([1, 2, 3, 4, 5]));
console.log(reverse2([1, 2, 3, 4, 5]));
console.log(reverse3([1, 2, 3, 4, 5], 0, 4));
