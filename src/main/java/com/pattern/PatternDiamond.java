package com.pattern;

public class PatternDiamond {

    public static void main(String[] args) {

        int size = 5;

        if (args.length > 0) {
            size = Integer.parseInt(args[0]);
        }

        for (int i = 1; i <= size; i++) {
            printRow(size, i);
        }
 
        for (int i = size - 1; i >= 1; i--) {
            printRow(size, i);
        }
    }

    private static void printRow(int size, int row) {

        for (int j = row; j < size; j++) {
            System.out.print(" ");
        }

        System.out.print("*");

        if (row > 1) {
            for (int j = 1; j <= (2 * row - 3); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }

        System.out.println();
    }
}