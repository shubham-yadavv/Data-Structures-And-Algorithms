// maximum number in an array

const arr = [1, 2, 3, 4, 5];


function maxNum(arr: number[]): number {

    if(arr.length === 0) {
        return -1;
    }
    let maxVal: number = arr[0];
    for(const i of arr) {
        if(i > maxVal) {
            maxVal = i;
        }
    }
    return maxVal;


}

console.log(maxNum(arr));

function max(arr: number[]): number {
    return Math.max(...arr);
    }

console.log(max([1, 2, 3, 4, 5]));
