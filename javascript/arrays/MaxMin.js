"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function min(arr) {
    let min = arr[0];
    for (let i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}
function max(arr) {
    let max = arr[0];
    for (let i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}
console.log(min([1, 2, 3, 4, 5]));
console.log(max([1, 2, 3, 4, 5]));
