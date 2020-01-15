package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice;
        int average;
        int[] myArray = new int[100];
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter your Choice::");
            System.out.println("1.Input Array");
            System.out.println("2.Display Array");
            System.out.println("3.Average of the Numbers");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    myArray = getArray();
                    break;

                case 2:

                    printArray(myArray);
                    break;

                case 3:

                    average = getAverage(myArray);
                    System.out.println("The average is ::" + average);
                    break;

                default:
                    System.out.println("Not A valid choice");
                    break;
            }
        }while(true);

    }

    public static int[] getArray(){
        int count;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        count = scanner.nextInt();

        int[] array = new int [count];

        System.out.println("Enter the Elements in the array::");
        for (int i = 0 ; i < count ; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.println(array[i]);
        }
    }

    public static int getAverage(int[] array){
        int sum = 0;

        for (int i = 0 ; i < array.length ; i++){
            sum += sum + array[i];
        }
        return sum / array.length;
    }





}
