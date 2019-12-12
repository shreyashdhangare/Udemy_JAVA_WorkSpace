package com.company;

public class Main {

    public static void main(String[] args) {
        double MyDoubleFirst = 20.00d;
        double MyDoubleSecond = 80.00d;
        double OutputOne = 100 * (MyDoubleFirst + MyDoubleSecond);

        System.out.println(OutputOne);

        double OutputTwo =(OutputOne % 40.00) ;
        System.out.println(OutputTwo);

        boolean isZero;

        if(OutputTwo == 0)
            isZero = true;
        else isZero = false;


        if(isZero)
            System.out.println("TRUE!!!");

        else System.out.println("FALSE!!!");

        if(!isZero)
            System.out.println("GOT SOME REMAINDER!!!");

    }
}
