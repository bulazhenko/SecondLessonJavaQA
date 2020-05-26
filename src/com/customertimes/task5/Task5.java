package com.customertimes.task5;

// 5) Create a program that calculates the factorial of an integer value n.

public class Task5 {

    public static int factorialCalculates(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Task #5:");
        System.out.println(factorialCalculates(5));
    }
}
