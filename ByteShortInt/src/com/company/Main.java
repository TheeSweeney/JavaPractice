package com.briansweeney;

public class Main {

    public static void main(String[] args) {
        //ints can hold large numbers but are space inefficient - width 32
        int highestPossible = 2_147_483_647;
        int lowestPossible = -2_147_483_648;

        //most efficient - width 8
        byte myByteValue = -128;

        //middle group - width 16
        short myShortValue = 32767;

        //always ends with a lower or uppercase L, uppercase preferred since it is more readable
        //width - 64
        long myLongValue = -9_223_372_036_854_775_808L;
    }
}
