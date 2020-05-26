package com.customertimes.task9;

//9) Create an array of any length and fill it with random integers.
// Using loops and conditions sort this array and print it out to the console.
// You can use any sorting algorithm you want. Do not use build-in methods to sort the array.

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Task #9:");
        int length = (int) (Math.random() * 30) + 5;
        int[] array = new int[length];
        System.out.println("Before Sorting: ");
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(bubbleSort(array)));
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}