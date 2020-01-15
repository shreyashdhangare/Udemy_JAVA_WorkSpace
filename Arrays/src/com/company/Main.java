package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array::");
        int numElements = scanner.nextInt();

        int myArray[] = getArray(numElements);

        System.out.println("The Array elements are::");
        for(int i = 0 ; i < numElements ; i++){
            System.out.println(myArray[i]);
        }
    }

    public static int[] getArray(int numElements){

        int[] myArray = new int[numElements];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i < numElements ; i++){
            myArray[i] = scanner.nextInt();
        }

        return myArray;

    }




}
