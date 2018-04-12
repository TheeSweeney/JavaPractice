package com.briansweeney;

public class Main {

    public static void main(String[] args) {
        //char can store one and only one character
        //width of 16/2 bytes
        //any unicode character can be placed in there using backslash u followed by the character code
	    char myChar = 'D';
	    char myUnicodeChar = '\u00A9';

        System.out.println("unicode output was " + myUnicodeChar);

    }
}
