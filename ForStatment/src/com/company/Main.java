package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        for(int i = 2 ; i < 9 ; i++){
            System.out.println("Intrest for 10000 at " + i +"% intrest is " + String.format("%.2f",CalculateIntrest(10000,i)));
        }

        System.out.println("******************************************************");

        for(int i = 8 ; i > 1 ; i--){
            System.out.println("Intrest for 10000 at " + i +"% intrest is " + String.format("%.2f",CalculateIntrest(10000,i)));
        }

        System.out.println(isPrime(7));

        for(int i = 0 ; i < 50 ; i++){
            if(isPrime(i)){
                count++;
                if(count == 3){
                    break;
                }
            }
        }

        System.out.println("TOTAL PRIME IN 50:=" + count);

    }

    public static double CalculateIntrest(double amount , double intrest){
        return amount * (intrest / 100);
    }


    public static boolean isPrime(int Number){
        int count;
        if(Number == 1){
            return false;
        }

        for(int i = 2 ; i < Number/2 ;i++){
            if(Number % i == 0) {
                return false;
            }
        }

        return true;

    }

}
