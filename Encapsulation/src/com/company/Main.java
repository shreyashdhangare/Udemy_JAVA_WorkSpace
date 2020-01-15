package com.company;

public class Main {

    public static void main(String[] args) {
/*
        Player player = new Player();
        player.name = "Shree";
        player.health = 100;
        player.weapon= "rod";

        int damage = 100;
        player.healthRemaining();
        player.loseHealth(1000);
        System.out.println("Remaining health:: " + player.healthRemaining());
*/
        EnhancedPlayer player = new EnhancedPlayer("Shree",99,"Rod");
        System.out.println("Player Initial health is::" + player.getHealth());






    }
}
