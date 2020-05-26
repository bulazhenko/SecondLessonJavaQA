package com.customertimes.task7;

//7) Create an array of 10 integers.
// Calculate and print the sum of all its elements except the first one and the last one.

public class Task7 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 41, 35, 13, 45, 61};

        System.out.println("Task #7");

        System.out.println(calculateWithoutFirstAndLast(array));
    }

    public static int calculateWithoutFirstAndLast(int[] array) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > 0 && i < array.length - 1) {
                summ += array[i];
            }
        }
        return summ;
    }
}
