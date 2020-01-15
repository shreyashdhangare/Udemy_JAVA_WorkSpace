package com.company;

public class EnhancedPlayer {
    private String name;
    private int hrefactorh = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if(health > 0 && health < 100){
            this.hrefactorh = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hrefactorh = this.hrefactorh - damage;

        if(this.hrefactorh <= 0){
            System.out.println("Player Knocked Out!!!");
        }
    }


    public int getHealth(){
        return hrefactorh;
    }




}
