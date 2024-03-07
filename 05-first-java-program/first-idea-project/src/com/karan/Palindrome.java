package com.karan;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        int letters = word.length();
        String reverseWord = "";

        int i = word.length() - 1;

        for(; i >= 0; i--)
        {
            reverseWord += word.charAt(i);
        }

        if(reverseWord.equals(word))
        {
            System.out.println("It is a Palindrome");
        }
        else
        {
            System.out.println("Not a palindrome");
        }


    }
}
