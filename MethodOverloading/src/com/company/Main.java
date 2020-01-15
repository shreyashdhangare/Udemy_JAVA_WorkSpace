package com.company;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
	    CalculateScore("Shreyash",500);
	    CalculateScore(500);
	    CalculateScore();
    }

    public static int CalculateScore(String PlayerName , int Score){
        System.out.println("Player: " + PlayerName + " Score :" +Score);
        return 0;
    }
    public static int CalculateScore(int Score){
        System.out.println( "Unnamed Player Score :" + Score);
        return 0;
    }
    public static int CalculateScore(){
        System.out.println("This Is One Hell Of A Method");
        return 0;
    }


}
