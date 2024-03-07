package com.karan;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide me with your name first");
        String name = input.nextLine();
        System.out.println("Hello "+name);



    }
}
