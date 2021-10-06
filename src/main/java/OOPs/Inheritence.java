/*
Inheritance is an important pillar of OOP(Object-Oriented Programming). It is the mechanism in java by which one class is allowed to inherit the features(fields and methods) of another class.

Important terminology:

Super Class: The class whose features are inherited is known as superclass(or a base class or a parent class).
Sub Class: The class that inherits the other class is known as a subclass(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.
How to use inheritance in Java

The keyword used for inheritance is extends.

*/


class One {
    public void method1() {
        System.out.println("Sneha");
    }
}


class Two extends One {
    public void method2() {
        System.out.println("Gadam");
    }
}


// Driver class
class Main {
    public static void main(String[] args) {
        Two test = new Two();
        test.method1();
        test.method2();
        test.method1();
    }
}
