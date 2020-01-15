package com.company;

public class Car extends Vehicle {

    private int doors;
    private int gears;
    private int wheels;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int doors, int gears, int wheels, boolean isManual, int currentGear) {
        super(name, size);
        this.doors = doors;
        this.gears = gears;
        this.wheels = wheels;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int Gear){
        this.currentGear = Gear;
        System.out.println("Car.serCurrentGear changed to " + this.currentGear +"gear");

    }

    public void changeVelocity(int speed,int direction){
        move(speed , direction);
        System.out.println("Car.changeVelicity called at speed :" + speed + "and direction: " + direction);
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("Car.stop Overridden called");
    }
}
