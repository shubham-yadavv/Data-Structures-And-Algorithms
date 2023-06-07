function linearSearch1(arr, target, start, end) {
    if (arr.length === 0) {
        return -1;
    }
    for (let i = start; i <= end; i++) {
        if (arr[i] === target) {
            return i;
        }
    }
    return -1;
}
const arr = [18, 12, -7, 3, 14, 28];
const target = 14;
console.log(linearSearch1(arr, target, 1, 4));
