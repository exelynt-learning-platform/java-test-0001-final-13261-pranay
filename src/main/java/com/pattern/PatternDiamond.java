package com.pattern;

public class PatternDiamond {


    private static final int PATTERN_SIZE = 5;

    public static void main(String[] args) {

        int n = PATTERN_SIZE;


        for (int i = 1; i <= n; i++) {
            printRow(n, i);
        }


        for (int i = n - 1; i >= 1; i--) {
            printRow(n, i);
        }
    }


    private static void printRow(int n, int i) {


        for (int j = i; j < n; j++) {
            System.out.print(" ");
        }


        System.out.print("*");


        if (i > 1) {
            for (int j = 1; j <= (2 * i - 3); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }

     
        System.out.println();
    }
}