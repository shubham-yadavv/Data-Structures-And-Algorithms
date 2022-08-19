// stack using array

class Stack {
    constructor(){
        this.MAX = 101
        this.top = -1
        this.array = []
        this.top = -1
    }

    push(x){
        if(this.top >= this.MAX - 1){
            return "Stack is full"
        }
        else{
            this.top++
            this.array[this.top] = x
        }
    }

    pop(){
        if(this.top < 0){
            return "Stack is empty"
        }
        else{
            let temp = this.array[this.top]
            this.top--
            return temp
        }
    }

    peek(){
        if(this.top < 0){
            return "Stack is empty"
        }
        else{
            return this.array[this.top]
        }
    }

    isEmpty(){
        return this.top < 0;
    }

    size(){
        return this.top + 1
    }

    clear(){
        this.top = -1
    }

    print(){
        let temp = this.top
        while(temp >= 0){
            console.log(this.array[temp])
            temp--
        }
    }

    reverse(){
        let temp = this.top
        let newStack = new Stack
        while(temp >= 0){
            newStack.push(this.array[temp])
            temp--
        }
        return newStack
    }

}

const stck = new Stack
stck.push(1)
stck.push(2)
stck.push(3)
stck.push(4)
// stck.push(7)
// stck.push(6)
// stck.push(4)
// stck.push(9)



stck.pop()


console.log(stck.peek())
console.log(stck.isEmpty())
console.log(stck.size())
console.log(stck.reverse())
stck.clear()
console.log(stck.isEmpty())
