package com.karan;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide a number to check whether a number is Even or Odd");

        int num = input.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
