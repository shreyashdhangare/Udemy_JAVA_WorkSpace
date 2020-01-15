package com.company;

public class Floor {
        private double Length , Width;

        public Floor(double length , double width){
            if(length <= 0){
                this.Length = 0;
            }
            else{
                this.Length = length;
            }

            if(width <= 0){
                this.Width = 0;
            }
            else{
                this.Width = width;
            }
        }

        public double getArea(){
            return this.Length * this.Width;
        }






}
