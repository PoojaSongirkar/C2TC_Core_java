package com.tns.assignments;

public class Factorial {

    public static void main(String[] args) {

        int num = 9;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}