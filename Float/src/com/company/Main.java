package com.company;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 5;
	    //floats should be followed by an "f" to denote they are floats
        //we can also cast float values -> float test = {float} 5
	    float myFloatValue = 5f;
	    //we should also end a double with D
        //if we use a decimal but neither an f nor a d, the compiler assumes it is a double
	    double myDoubleValue = 5d;

        System.out.println("myIntValue " + myIntValue);
        System.out.println("myFloatValue " + myFloatValue);
        System.out.println("myDoubleValue " + myDoubleValue);
    }
}
