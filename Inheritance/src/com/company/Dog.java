package com.company;

public class Dog extends Animal {
    public Dog(String name, int brain, int body, int size, int weight,int eyes , int legs, int tail , int teeth , String coat) {
        super(name,brain,brain, size, weight);
        this.eyes = eyes;
        this.coat = coat;
        this.legs = legs;
        this.teeth = teeth;
    }

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    @Override
    public void eat() {
        System.out.println("Eat override is called");
        super.eat();
        chew();
    }

    private void chew(){
        System.out.println("Dog.chew called");
    }

    public void walk(){
        System.out.println("dog.walk called");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run called");
        move(26);
    }



}
