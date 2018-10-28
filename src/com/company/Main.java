package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorial(6));
    }

    private static int factorial(int n) {
        if (n == 2) {
            return n;
        }
        return n * factorial(n -1);
    }

}



