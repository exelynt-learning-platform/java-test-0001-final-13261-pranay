package com.pattern;

public class PatternDiamond {

    private static final int PATTERN_SIZE = 5;

    public static void main(String[] args) {

        for (int i = 1; i <= PATTERN_SIZE; i++) {
            printRow(PATTERN_SIZE, i);
        }

        for (int i = PATTERN_SIZE - 1; i >= 1; i--) {
            printRow(PATTERN_SIZE, i);
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