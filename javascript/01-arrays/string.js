// string in js


function string(words){
    let sentence = "";

    for (const word of words) {
        sentence += word + " ";
    }

    return sentence;
}

console.log(string(["Hello", "World", "I", "am", "a", "programmer"]));