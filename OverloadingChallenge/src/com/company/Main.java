package com.company;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(12, 8);
        calcFeetAndInchesToCentimeters(11); 

    }

    public static int calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
            double inchToCm, feetToCm;
            inchToCm = 2.54 * inches;
            feetToCm = 12 * 2.54 * feet;

            System.out.println(inches + " inches :: " + inchToCm + " cms");
            System.out.println(feet + " feet :: " + feetToCm + " cms");

            return 0;
        } else {
            return -1;
        }
    }

    public static int calcFeetAndInchesToCentimeters(double inches) {
        if(inches >= 0 ){
            double inchToCm;
            inchToCm = 2.54 * inches;
            System.out.println(inches + " inches :: " + inchToCm + " cms");
            return 0;
        }
        else{
            return -1;
        }

    }


}
