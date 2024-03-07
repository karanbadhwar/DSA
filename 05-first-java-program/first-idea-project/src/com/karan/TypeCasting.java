package com.karan;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();

//        System.out.println(num);

        /*
        * Type Conversion will happen automatically for Compatible type,
        * Type Casting needs to be done for InCompatible type which is called Narrowing Conversion,
        * */

        int numNarrowing = (int)67.45f;
//        System.out.println(numNarrowing);

        //Automatic type promotion in Expressions
        int a = 257;
        byte bite = (byte)a; //OverFlow or 257 % 256 = 1

        byte b1 = 40;
        byte b2 = 50;
        byte b3 = 100;

        int exceeds = b1 * b2; // Over here a*b is 2000 which exceeds the byte value, so it promotes the value to int

//        byte g = a + b; // It will give an error


        int number = 'a'; // It will convert it to it's ASCII value

//        System.out.println(number);

//        System.out.println("नमस्ते");

        int charToNum = 'न';

//        System.out.println(charToNum);


        //Example
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;

        var result = (f * b) + (i / c) - (d - s); // Biggest Value is Double

        System.out.println(((Object)result).getClass().getName());

        System.out.println(result);


    }
}
