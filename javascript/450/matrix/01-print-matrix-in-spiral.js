// prtin matrix in spiral form

function printSpiral(matrix, row, col) {
    let result = [];
    let top = 0;
    let bottom = row - 1;
    let left = 0;
    let right = col - 1;

    while (top <= bottom && left <= right) {
        // top row
        for (let i = left; i <= right; i++) {
            result.push(matrix[top][i]);
        }
        top++;

        // right column
        for (let i = top; i <= bottom; i++) {
            result.push(matrix[i][right]);
        }
        right--;

        // bottom row
        if (top <= bottom) {
            for (let i = right; i >= left; i--) {
                result.push(matrix[bottom][i]);
            }
            bottom--;
        }

        // left column
        if (left <= right) {
            for (let i = bottom; i >= top; i--) {
                result.push(matrix[i][left]);
            }
            left++;
        }
    }

    return result;

}


let matrix = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12],
    [13, 14, 15, 16],
];


console.log(printSpiral(matrix, 4, 4));
