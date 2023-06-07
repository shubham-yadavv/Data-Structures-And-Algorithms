// // Given an array A of size N, print the reverse of it.

// // Example:

// // Input:
// // 1
// // 4
// // 1 2 3 4
// // Output:
// // 4 3 2 1
// // Input:
// // First line contains an integer denoting the test cases 'T'. T testcases follow. Each testcase contains two lines of input. First line contains N the size of the array A. The second line contains the elements of the array.

// // Output:
// // For each testcase, in a new line, print the array in reverse order.

// //Initial Template for JavaScript

// process.stdin.resume();
// process.stdin.setEncoding("ascii");
// let read = "";
// process.stdin.on("data", function (input) {
//   read += input;
// });


// process.stdin.on("end", function () {
//     read = read.replace(/\n$/, "");

//     main(read);

// });

// function main(input) {
//     let arr = input.split("\n");
//     let t = Number(arr[0]);
//     let index = 1;
//     for (let i = 0; i < t; i++) {
//         let n = Number(arr[index++]);
//         let arr1 = arr[index++].split(" ").map(Number);
//         let res = new Solution().reverseArray(arr1, n);
//         console.log(res);
//     }
// }



