package com.customertimes.task4;

//4) Create an array of 10 integers.
// Find the square root of each element and put the to result array.
// Print the result array to the console.

public class Task4 {
    public static void main(String[] args) {
        int[] arrayTen = new int[10];
        System.out.println("Task #4:");
        for (int i = 0; i < 10; i++) {
            arrayTen[i] = (int) Math.sqrt(arrayTen[i]);
            System.out.println(arrayTen[i]);
        }
    }
}


