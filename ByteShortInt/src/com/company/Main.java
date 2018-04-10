package com.company;

public class Main {

    public static void main(String[] args) {
        //ints can hold large numbers but are space inefficient - width 32
        int myNewIntHigh = 2_147_483_647;
        int myNewIntLow = -2_147_483_648;

        //most efficient - width 8
        byte myByteValue = -128;
        //expressions evaluate to ints by default
        //byte myNewByte =(myByteValue/2) will throw an error
        //we fix with with "casting"
        byte myNewByte = (byte) (myByteValue/2);

        //middle group - width 16
        //casting rules apply to shorts as well
        short myShortValue = 32767;

        //always ends with a lower or uppercase L, uppercase preferred since it is more readable
        //width - 64
        //longs don't have a problem with ints.
        long myLongValue = -9_223_372_036_854_775_808L;

        long exerciseLong = 50_000 + 10 * (myByteValue + myShortValue + myNewIntHigh);
        System.out.println(exerciseLong);
    }
}
