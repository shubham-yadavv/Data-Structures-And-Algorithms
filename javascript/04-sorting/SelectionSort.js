// Function of selection sort 
const selectionSort = (array)=>{
    for (let i = 0; i < array.length; i++) {
        let minimum_index = i;

        for (let j =i+1;j < array.length;j++) {
            if(array[j]<array[minimum_index]){
                minimum_index=j;
            }

        }
        let temp = array[minimum_index];
        array[minimum_index]=array[i];
        array[i]=temp;
    }
}

let array = [76,57,67,4,9];
selectionSort(array);
console.log(array);