package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static GroceryList groceryList = new GroceryList();



    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();

        while (!quit){
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            switch (choice){
                case 0 :
                    printInstruction();
                    break;

                case 1:
                    groceryList.getGroceryList();
                    break;

                case 2:
                    addItem();
                    break;

                case 3:




            }

        }

    }
}
