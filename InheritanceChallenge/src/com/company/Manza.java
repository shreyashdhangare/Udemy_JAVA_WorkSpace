package com.company;

public class Manza extends Car {
    public Manza(int currentGear, int roadService) {
        super("Manza", "4WD", 4, 6, 4, false, currentGear);
        this.roadService = roadService;
    }

    private int roadService;


    public void accelarate(int rate){
        int newVelocity = changeVelocity() + rate;
        if(newVelocity == 0){
            stop();
        }

        else {
            if(newVelocity >= 0 && newVelocity <=10){
                changeGear(1);
            }
            else if(newVelocity > 10 && newVelocity <= 50){
                changeGear(2);
            }
            else {
                changeGear(3);
            }
        }
    }

    private int changeVelocity() {
        return this.changeVelocity();
    }

}
