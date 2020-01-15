package com.company;


public class Main {

    public static void main(String[] args) {

        ComplexNumber complexNumber = new ComplexNumber(4,3);
        ComplexNumber myNumber = new ComplexNumber(3,4);

        System.out.println(complexNumber.getReal());
        System.out.println(complexNumber.getImaginary());
        complexNumber.add(3,4);
        System.out.println(complexNumber.getReal());
        System.out.println(complexNumber.getImaginary());
        complexNumber.add(myNumber);
        System.out.println(complexNumber.getReal());
        System.out.println(complexNumber.getImaginary());


    }
}
    