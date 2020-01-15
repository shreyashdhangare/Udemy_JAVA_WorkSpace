package com.company;

public class SimpleCalculator {
        private double firstNumber ;
        private double secondNumber ;


        public double getFirstNumber(){
            return firstNumber;
        }

        public double getSecondNumber(){
            return secondNumber;
        }

        public void setFirstNumber(double number){
            this.firstNumber = number;
        }

        public void setSecondNumber(double number){
            this.secondNumber = number;
        }

        public double getAdditionResult(){
            return this.firstNumber + this.secondNumber;
        }

        public double getSubtractionResult(){
            return this.secondNumber - this.secondNumber;
        }

        public double getMultiplicationResult(){
            return this.firstNumber * this.secondNumber;
        }

        public double getDivisionResult(){
            if(this.secondNumber == 0){
                return 0;
            }
            else {
                return (this.firstNumber/this.secondNumber);
            }
        }

}
