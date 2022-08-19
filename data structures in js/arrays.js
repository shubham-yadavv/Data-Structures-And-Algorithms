// const arr = ['store', 1, 'whatever', 2, 'you want', 3]
// console.log(arr)

// const arr2 = [
//     [1,2,3],
//     [4,5,6],
//     [7,8,9],
// ]
// console.log(arr2)

const obj = {
    prop1: "I'm",
    prop2: "an",
    prop3: "object"
}


// const obj2 = {
//     prop1: "Hello!",
//     prop3: function() {console.log("I'm a property dude!")
// }}
// console.log(obj2.prop1) // "Hello!"
// console.log(obj2["prop1"]) // "Hello!"
// obj2.prop3() 

obj.prop4 = 125
obj["prop5"] = "The new prop on the block"
obj.prop6 = () => console.log("yet another example")

console.log(obj.prop4) // 125
console.log(obj["prop5"]) // "The new prop on the block"
obj.prop6() // "yet another example"