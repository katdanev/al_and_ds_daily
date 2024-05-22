package com.keyin;


//Calculate the avarage temperature, and give how many days are above the average temperature

// 1. taka an input from the user (eg 8)
// 2. promt the user to enter all the 8 numbers
// 3. calculate the average temperature
// 4. Given the avarage tempeture, how many of the numbers in line 2 are above the average temperature



import java.util.Scanner;
import java.util.Arrays; // do we need this?

public class CalculateAverageTemperature {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Object for reading user input

        System.out.println("Enter the number of days: ");
        int days = scanner.nextInt(); // Number of days for calculating the average temperature

        // Array for storing temperatures
        int[] temperatures = new int[days]; // Array to store temperatures according to the number of days

        // Reading temperatures from the user
        for (int i = 0; i < days; i++) {
            System.out.println("Enter the temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextInt();
        }

        // Calculating the average temperature
        int sum = 0;
        for (int temp : temperatures) {
            sum += temp;
        }
        int average = sum / days;

        System.out.println("The average temperature is: " + average);

        // Counting the number of days with temperature above average
        int countAboveAverage = 0;
        for (int temp : temperatures) {
            if (temp > average) {
                countAboveAverage++;
            }
        }

        System.out.println("The number of days above the average temperature is: " + countAboveAverage);

        scanner.close();
    }
}
