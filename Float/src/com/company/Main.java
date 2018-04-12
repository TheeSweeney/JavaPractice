package com.company;

public class Main {

    public static void main(String[] args) {
        //dividing an int will return the number with no remainder or decimal
	    int myIntValue = 5/2;
	    //floats should be followed by an "f" to denote they are floats
        //we can also cast float values -> float test = {float} 5
        //float have 7 decimals of precision
	    float myFloatValue = 5f/3f;
	    //we should also end a double with D
        //if we use a decimal but neither an f nor a d, the compiler assumes it is a double
        //doubles have 16 decimals of precision
        //doubles take up twice the amount of memory -> 64 bits/8bytes vs 32bits/4bytes for floats/ints
        //doubles are faster and more precise so is generally preferred over floats
	    double myDoubleValue = 5d/3d;

        System.out.println("myIntValue " + myIntValue);
        System.out.println("myFloatValue " + myFloatValue);
        System.out.println("myDoubleValue " + myDoubleValue);

        int pounds = 5;
        double conversion = 0.45359237d;
        double kilos = pounds * conversion;
        System.out.println(kilos);


        //tou can use underscores in decimals too.
        double pi = 3.141_592_7d;
    }
}
