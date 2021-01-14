package com.tts.main;

import java.util.Scanner;

public class SumPowerUtilities {

    //get size and array numbers from user and return array
    public static double[] getSizeAndNumbers() {

        Scanner readInput = new Scanner(System.in);
        System.out.println("What size do you want your array?");
        int arraySize = readInput.nextInt();
        double[] numberArr = new double[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter a number: ");
            numberArr[i] = readInput.nextDouble();
        }
        return numberArr;
    }

    //#1 sum a given array returns a double
    public static double mySum(double[] thisArr) {

        double sum = 0;

        for (double eachVal : thisArr) {
            sum += eachVal;
        }
        return sum;
    }

    //#3 write a method that takes 2 parameters, size and power and returns an
    //array of the specified size with each array index raised to the specified power
    public static int[] toPower(int size, int power) {

        int[] poweredArr = new int[size];

        for (int i = 0; i < poweredArr.length; i++) {
            int number = i;

            for (int j = power; j > 1; j--) {
                number *= i;
            }
            poweredArr[i] = number;
        }
        return poweredArr;
    }

}//end SumPowerUtilities class

/*
      //#2 read the code. what is the output?
        double[ ] exampleArray = {1,5,6,5,4,1};

        //maximum is set to the first element of the array
        double maximum = exampleArray[0];

        //and index is set to the first element's index
        int index = 0;

        //traverse the rest of the elements starting with the second (its index is 1)
        for (int i = 1; i<exampleArray.length; i++){

            //check each value against the current maximum
           if (exampleArray[ i ] > maximum) {

                //if current value is greater than current maximum
                //then set maximum to that value
                //and update the index
                maximum = exampleArray[ i ];
                index = i;
           }
        }
        //print the index of the maximum value in the array, index = 2
        System.out.println(index);

 */
