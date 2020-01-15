package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter the Number of elements in the array");
        number = scanner.nextInt();

        int[] myArray = new int[number];

        System.out.println("Enter the number of elements in the Array::");
        for(int i = 0 ; i < myArray.length ; i++){
            myArray[i] = scanner.nextInt();
        }

        System.out.println("The Input Array is::");
        System.out.println(Arrays.toString(myArray));

        int minNum = myArray[0];
        for(int i = 0 ; i < myArray.length ; i++){
            if(minNum > myArray[i]){
                minNum = myArray[i];
            }
        }

        System.out.println(minNum);



    }
}
