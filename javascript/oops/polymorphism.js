// polymorphism in javascript

class Animal {
    constructor(name) {
        this.name = name;
    }

    add(a, b) {
        console.log(a + b);
    }
}

class Dog extends Animal {
    constructor(name) {
        super(name);
    }

    add(a, b, c) {
        console.log(a + b + c);
    }
}



let dog = new Dog('dog');

dog.add(1, 2);
dog.add(1, 2, 3);

