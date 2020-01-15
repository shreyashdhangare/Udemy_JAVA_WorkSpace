package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Car Porche = new Car();
        Car Manza = new Car();
        Car Tata = new Car();

        Porche.setModel("Carrera");
        System.out.println("THE MODEL::" + Porche.getModel());

    }
}
