package com.company;

public class Main {

    public static void main(String[] args) {

        boolean GameOver = true;
        int Score = 500;
        int LevelCompleted = 5;
        int Bonus = 100;
        int Results;
        String Name1 = "Varun";
        String Name2 = "Tara";
        String Winner;
        int Position;


        Results = calculateScore(true,Score,LevelCompleted,Bonus);
        System.out.println("YOUR FINAL SCORE IS :: " + Results);

        Score = 10000;
        LevelCompleted = 8;
        Bonus = 200;

        Results = calculateScore(true,Score,LevelCompleted,Bonus);
        System.out.println("YOUR FINAL SCORE IS :: " + Results);


        Winner = displayHighScorePosition(Name1,Name2);
        System.out.println("The Winner is ::" + Winner);

        Position = calculateHighScorePosition(1500);
        System.out.println("THE POSITION IS :: " + Position);

        Position = calculateHighScorePosition(900);
        System.out.println("THE POSITION IS :: " + Position);

        Position = calculateHighScorePosition(400);
        System.out.println("THE POSITION IS :: " + Position);

        Position = calculateHighScorePosition(50);
        System.out.println("THE POSITION IS :: " + Position);

    }

    public static int calculateScore(boolean GameOver, int Score, int LevelCompleted, int Bonus){

        int FinalScore = 0;

        if(GameOver){
            FinalScore = Score + (LevelCompleted * Bonus);
            FinalScore += 1000;
            return FinalScore;
        }
        else
            return -1;

    }

    public static String displayHighScorePosition(String Name1,String Name2){
        int Score1 = 100;
        int Score2 =200;

        if(Score1 > Score2){
            return Name1;
        }
        else
            return  Name2;


    }

    public static int calculateHighScorePosition(int Score){
        if(Score > 1000)
            return 1;

        else if(Score > 500 && Score <= 1000)
            return 2;

        else if(Score > 100 && Score <= 500)
            return 3;

        else return 4;
    }



}
