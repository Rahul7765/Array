package com.array;

public class Add_Array {

    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {5, 10, 15, 20, 25};

        // Variable to store the sum
        int sum = 0;

        // Loop through the array and calculate the sum
        for (int num : numbers) {
            sum += num;
        }

        // Print the total sum
        System.out.println("Sum of array elements: " + sum);
    }
}
