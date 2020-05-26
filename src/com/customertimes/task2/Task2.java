package com.customertimes.task2;

//2) Create a simple program that calculates and prints the square of a rectangle and a circle.
// Import and use Math class.

public class Task2 {

    public static double areaCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double areaRectangle(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println("Task #2:");
        System.out.println("Area of Circle: " + areaCircle(15.00));
        System.out.println("Area of Rectangle: " + areaRectangle(16, 12));
    }
}