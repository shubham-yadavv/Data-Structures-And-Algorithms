// Approach 1: Brute Force
// traverse the matrix and check if target is present
// time complexity: O(row * col) = O(n^2)
// space complexity: O(1)
function searchInMatrix1(matrix, row, col, target) {
    for (let i = 0; i < row; i++) {
        for (let j = 0; j < col; j++) {
            if (matrix[i][j] === target) {
                return 1;
            }
        }
    }
    return 0;
}

// Approach 2: Optimized approach
// start from top right corner
// if target is greater than current element, move down
// if target is smaller than current element, move left
// time complexity: O(row + col) = O(n)
// space complexity: O(1)
function searchInMatrix2(matrix, row, col, target) {
    let i = 0;
    let j = col - 1;

    while (i < row && j < col) {
        if (matrix[i][j] === target) {
            return 1;
        } else if (matrix[i][j] > target) {
            j--;
        } else {
            i++;
        }
    }
    return 0;
}



let matrix = [
    [10, 20, 30, 40],
    [15, 25, 35, 45],
    [27, 29, 37, 48],
    [32, 33, 39, 50],
];

console.log(searchInMatrix1(matrix, 4, 4, 100));
console.log(searchInMatrix2(matrix, 4, 4, 29));