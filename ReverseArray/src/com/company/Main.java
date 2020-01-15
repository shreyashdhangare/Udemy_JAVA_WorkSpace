package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter the number of elements in the array::");
        number = scanner.nextInt();

        int[] myArray = new int[number];

        System.out.println("Enter the elements in the array:");
        for(int i = 0 ; i < number ; i++){
            myArray[i] = scanner.nextInt();
        }

        System.out.println("The numbers in the array are::");
        for(int i = 0 ; i < number ; i++){
            System.out.println(myArray[i]);
        }



    }

    public void mergeSort(int[] array, int left, int right){

        if(left < right){
            int mid = left + ((right-left)/2);
            mergeSort(array,left,mid);
            mergeSort(array,mid+1,right);
            mergeFunction(array,left,mid,right);
        }

    }

    public void mergeFunction(int[] array , int left , int middle , int right){
        int i,j,k;
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for( i = 0 ; i < n1 ; i++){
            L[i] = array[left + i];
        }

        for( i = 0 ; i < n2 ; i++){
            R[i] = array[middle + 1 + i];
        }

        i=0;j=0;k=left;

        while(i < n1 && j < n2){

            if(L[i] <= R[j]){

            }




        }



    }


}
