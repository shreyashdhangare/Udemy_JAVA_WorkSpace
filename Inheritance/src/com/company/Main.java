package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Foofy",1,1,20,12);

        Dog myDog = new Dog("Tommy",1,1,20,25,2,4,1,32,"hair");

        myDog.eat();
        myDog.run();
        myDog.walk();

    }
}
