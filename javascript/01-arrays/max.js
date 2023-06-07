function maxnum(arr){
    let currentMax = arr[0];
    for(let i = 1; i < arr.length; i++){
        if(arr[i]> currentMax){
            currentMax = arr[i]
        }
    }
    return currentMax

}

function maxnumInRange(arr, start, end){
    
    if (start > end){
        return -1
    }

    let currentMax = arr[0];
    for(let  i = start; i < end + 1; i++){
        if(arr[i] > currentMax){
            currentMax = arr[i]
        }

    }
    return currentMax
}


let arr = [ 3,5,8,7,12]
console.log(maxnum(arr))
console.log(maxnumInRange(arr, 0 , 3))