package com.karan;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to calculate Fibonacci series");

        int n = scan.nextInt();

        for(int i = 1; i <= n; i++)
        {
            System.out.print(firstNumber+", ");

            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;


        }


    }
}
