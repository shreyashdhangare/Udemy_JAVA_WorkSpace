package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

/*        Dimensions dimensions = new Dimensions(5,5,5);
        Case theCase = new Case("new220","intel","120",dimensions);

        Resolution resolution = new Resolution(30,30);
        Monitor monitor = new Monitor("23_beast","Acer",32,resolution);

        Motherboard motherboard = new Motherboard("BJ-123","Dell",4,4,"Default");

        PC myPC = new PC(theCase, monitor,motherboard);
        myPC.powerUp();*/

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(45,"Blue");

        Bed bed = new Bed("Italic",2,30,5,1);
        Lamp lamp = new Lamp("Indian",true,3);

        Bedroom bedroom = new Bedroom("MyBedRoom",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();



    }
}
