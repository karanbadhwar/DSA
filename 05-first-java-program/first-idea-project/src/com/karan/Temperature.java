package com.karan;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter temp in Celsius: ");

        float celsius = input.nextFloat();

        float ferehinit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in ferehinit "+ferehinit);
    }
}
