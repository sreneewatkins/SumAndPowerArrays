package com.tts.main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //get numbers from user for the array and allow user to choose when to quit
        double[] thisArray = {3, 2.125, 5};
        double[] userArray = SumPowerUtilities.getSizeAndNumbers();

        //sum the array returns a double
        System.out.println(SumPowerUtilities.mySum(thisArray));
        System.out.println(SumPowerUtilities.mySum(userArray));

        //power the array returns an array
        System.out.println(Arrays.toString(SumPowerUtilities.toPower(5, 3)));

    }//end main()

}//end Main class
