package com.karan;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        int start = 1;
        int end = 153;

        for(int i = start; i <=end; i++)
        {
            if(isArmStrong(i))
            {
                System.out.println("Number "+i+" is Armstrong");
            }
        }

    }

    public static boolean isArmStrong(int i)
    {
        int count = 0;
        int sum= 0,z,r;
        z = i;
        r = i;
        while(z > 0)
        {
            z = z /10;
            count++;
        }
        for(int j = 1; j <= count; j++)
        {
            int temp = r % 10;
            r = r /10;
            sum += (int)Math.pow(temp, count);
        }

        if(sum == i)
        {
            return true;
        } else {
            return false;
        }

    }
}
