package com.array;

public class sub {

    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {100, 20, 10, 5};

        // Start with the first element
        int result = numbers[0];

        // Subtract the rest
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }

        // Print the result
        System.out.println("Result after subtraction: " + result);
    }
}
