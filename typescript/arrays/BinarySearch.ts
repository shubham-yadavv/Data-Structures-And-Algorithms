function binarySearch(arr: number[], target: number): number {
    let start = 0;
    let end = arr.length - 1;
    while (start <= end) {
        const mid = Math.floor(start + (end - start) / 2);
        if (target < arr[mid]) {
            end = mid - 1;
        } else if (target > arr[mid]) {
            start = mid + 1;
        } else {
            return mid;
        }
    }
    return -1;
}

let arr: number[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20 ];
let target = 16
console.log(binarySearch(arr, target))

export{}