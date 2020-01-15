package com.company;

public class Carpet {

        private double Cost;

        public Carpet(double cost){
            if(cost <= 0){
                this.Cost = 0;
            }
            else{
                this.Cost = cost;
            }
        }

        public double getCost(){
            return Cost;
        }



}
