package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue::" + myIntValue);
        System.out.println("anotherIntValue" + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue::" + myIntValue);
        System.out.println("anotherIntValue" + anotherIntValue);

        int[] myArray = new int[10];
        int[] anotherArray = myArray;

        System.out.println("myIntValue::" + Arrays.toString(myArray));

        myArray[0] = 12;
        anotherArray[3] = 19;

        System.out.println("myIntValue::" + Arrays.toString(myArray));
        System.out.println("anotherarray::" + Arrays.toString(anotherArray));

        modifyArray(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    private static void modifyArray(int[] array){
        array[0] = 4;
        array = new int[] {1,2,3,4,5};
        System.out.println("+++++++"+Arrays.toString(array));
    }


}
