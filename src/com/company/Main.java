package com.company;

class Car{
    private boolean engine;
    private int cylinder;
    private int wheels;
    private String name;

    public Car(int cylinder, String name) {
        this.engine = true;
        this.cylinder = cylinder;
        this.wheels = 4;
        this.name = name;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }


    public String startEngine(){
        return "Start->Car engine";
    }

    public String accelarate(){
        return "accelarate->Engine";
    }

    public String brake(){
        return "Brakes applied";
    }

}

class Mitsubushi extends Car{
    public Mitsubushi(int cylinder,String name){
        super(cylinder, name);
    }

    public String accelarate(){
        return "Mitsubushi->accelarate";
    }

    public String startEngine(){
        return "Mitsubushi Start->Engine";
    }

    public String brake(){
        return "Mitsubushi Brakes applied";
    }

}







public class Main {

    public static void main(String[] args) {
        Car car = new Car(4,"Manza");
        System.out.println(car.startEngine());
        System.out.println(car.accelarate());
        System.out.println(car.brake());

        Mitsubushi Lancer = new Mitsubushi(6,"Lancer");
        System.out.println(Lancer.startEngine());
        System.out.println(Lancer.accelarate());
        System.out.println(Lancer.brake());
    }
}
