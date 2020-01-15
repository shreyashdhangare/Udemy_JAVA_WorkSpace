package com.company;

import System.out.println;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number = 0;
        Scanner scanner = new Scanner(System.in);



        System.out.println("Enter the number of elements in the array");
        number = scanner.nextInt();

        int[] myArray = new int[number];


        System.out.println("Enter the elements in the array::");
        for(int i = 0 ; i < number ; i++){
            myArray[i] = scanner.nextInt();
           // scanner.nextLine();
        }

        System.out.println("The Entered array is:: ");
        System.out.println(Arrays.toString(myArray));









    }

/*
    public static int smallestNumer(int[] array){
        int largest = array[0];




    }

*/



}
