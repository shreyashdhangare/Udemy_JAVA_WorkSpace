package com.company;

import jdk.jshell.EvalException;

public class Main {

        private static final String INVALID_VALUE_MESSAGE = "Invalid value";


    public static void main(String[] args) {


        getDurationString(124,300);
        System.out.println(getDurationString(-124,300));
        System.out.println(getDurationString(330));
    }

    public static String getDurationString(int minutes , int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59 ){
            return INVALID_VALUE_MESSAGE;
        }
        else{
            int hrs = minutes / 60;
            minutes = minutes % 60;
            return hrs + " h " + minutes + " m " + seconds + " s ";
        }

    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        else{
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes,seconds);
        }
    }


}
