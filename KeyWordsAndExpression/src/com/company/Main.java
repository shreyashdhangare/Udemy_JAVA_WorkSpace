package com.company;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        boolean GameOver = true;
        int Score = 4000;
        int LevelCompleted = 5;
        int Bonus = 1000;

 /*       if(Score < 5000 && Score > 1000)
            System.out.println("YOUR SCORE IS 5000 BUT GREATER THAN 1000");
        else
            System.out.println("THE SCORE IS LESS THAN 1000");
 */
/*
        if(GameOver == true){
            int FinalScore = Score + (LevelCompleted * Bonus);
            System.out.println("THE FINAL SCORE IS ::" + FinalScore);
        }

        */
        int SecondScore = 10000;
        int LevelCompletedNew = 8;
        int NewBonus = 200;

        if (GameOver) {
            System.out.println("MY SECOND SCORE " + SecondScore);
            System.out.println("MY NEW LEVEL " + LevelCompletedNew);
            System.out.println("MY NEW BONUS " + NewBonus);

            int FinalScore = SecondScore + (LevelCompletedNew * NewBonus);
            System.out.println("MY NEW FINAL SCORE " + FinalScore);

        }


    }
}
