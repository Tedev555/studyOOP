package me.tedory;

class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal {
    public void move() {
        super.move();   // invokes the super class method
        System.out.println("Dogs can walk and run");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.move();// runs the method in Dog class
    }
}
