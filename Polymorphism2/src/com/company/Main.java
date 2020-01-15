package com.company;

import java.util.Date;

class Movie{
    public String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "NO PLOT HERE";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot(){
        return ("Sharks Eat many People");
    }

}

class Barfi extends Movie{
    public Barfi(){
        super("Barfi");
    }

    @Override
    public String plot(){
        return "Thriller and Comedy";
    }
}

class Dabanng extends Movie{
    public Dabanng(){
        super("Dabanng");
    }

    @Override
    public String plot(){
        return "Super tatti movie";
    }
}

class YJHD extends Movie{

    public YJHD() {
        super("YJHD");
    }

    @Override
    public String plot(){
        return "Love with your best friend.";
    }

}


class MissionImpossible extends Movie{
    public MissionImpossible(){
        super("Mission Impossible");
    }

    @Override
    public String plot(){
        return "Some American guys save the world from the threat of world war";
    }

}

class Avatar2 extends Movie{
    public Avatar2(){
        super("Avatar 2");
    }

    //No plot Known

}


public class Main {

    public static void main(String[] args) {

        for(int i = 0 ; i < 11 ; i++){
            Movie movie = randomMovie();
            System.out.println("Movie :" + i+ "." + movie.getName() + "\n"+ "plot:" +movie.plot() +"\n");
        }



    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number is" + randomNumber);

        switch (randomNumber){
            case 1: return new Jaws();

            case 2: return new Barfi();

            case 3:return new Dabanng();

            case 4:return new YJHD();

            case 5:return new MissionImpossible();

            case 6:return new Avatar2();

            default:return null;
        }
    }

}
