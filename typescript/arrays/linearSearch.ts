// linear search 

function linearSearch(arr: number[], key: number): number {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === key) {
            return i;
        }
    }
    return -1;
}

console.log(linearSearch([1, 2, 3, 4, 5], 3));