package com.company;

import java.io.File;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator First = new SimpleCalculator();

        System.out.println(First.getFirstNumber());
        System.out.println(First.getSecondNumber());

        First.setFirstNumber(144);
        First.setSecondNumber(196);

        System.out.println("add= " + First.getAdditionResult());
    }
}
