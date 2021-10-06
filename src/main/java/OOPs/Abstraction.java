package OOPs;/*Ways to achieve Abstraction
There are two ways to achieve abstraction in java

Abstract class (0 to 100%)
Interface (100%)


Points to Remember
    An abstract class must be declared with an abstract keyword.
    It can have abstract and non-abstract methods.
    No body for abstrat methods

    Example of abstract class

        abstract class A{}

        Example of abstract method

        abstract void testMethod();//no method body and abstract
*/


// abstarct calss declared with abstarct method
abstract class Shape {
    abstract void draw();
}


//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
}


class Circle1 extends Shape {
    void draw() {
        System.out.println("drawing circle");
    }
}


// Testing
class TestAbstraction {
    public static void main(String args[]) {
        Shape s = new Circle1();
        s.draw();
    }
}
