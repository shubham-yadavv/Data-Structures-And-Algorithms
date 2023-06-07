// class

class Parent {
  hello() {
    console.log("Hello from Parent");
  }


    static yoo() {
    console.log("static method called");
  }



}

class Child extends Parent {
  hello2() {
    console.log("Hello from Child");
  }
}

let child = new Child();
child.hello();
child.hello2();




