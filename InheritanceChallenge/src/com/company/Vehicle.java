package com.company;

public class Vehicle {

    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction ){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer called at" + currentDirection + "Degrees") ;
    }

    public void move(int velocity , int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move at velocity " + currentVelocity + "at direction " + currentDirection);
    }

    public void stop(){
        move(0,0);
        System.out.println("Vehicle.stop called and speed is :" + currentVelocity + "kmph");
    }

}
