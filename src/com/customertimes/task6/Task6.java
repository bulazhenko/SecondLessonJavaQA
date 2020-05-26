package com.customertimes.task6;

// 6) Create a program that print to the console following figures.
// Use loops, asterisks("*") and spaces (" ").

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Task #6:");
        printFigureA(8, 8);
        printFigureB(8, 5);
        printFigureC(7);
        printFigureD(9);

    }

    private static void printFigureA(int x, int y) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void printFigureB(int x, int y) {
        for (int i = 0; i < y; i++) {
            if (i == 0 || i == y - 1) {
                for (int j = 0; j < x; j++) {
                    System.out.print('*');
                }
            } else {
                for (int j = 0; j < x; j++) {
                    if (j == 0 || j == x - 1) {
                        System.out.print('*');
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    private static void printFigureC(int y) {
        for (int i = 0; i < y; i++) {
            int j = 0;
            do {
                System.out.print('*');
                j++;
            } while (j != i + 1);
            System.out.println();
        }
    }

    private static void printFigureD(int y) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}




