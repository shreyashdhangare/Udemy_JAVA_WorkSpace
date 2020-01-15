package com.company;

public class Main {

    public static void main(String[] args) {

        Floor myFloor = new Floor(4,5);
        Carpet myCarpet = new Carpet(20);
        Calculator totPrice = new Calculator(myFloor,myCarpet);

        System.out.println(myFloor.getArea());
        System.out.println(myCarpet.getCost());
        System.out.println(totPrice.getTotalCost());



    }
}
