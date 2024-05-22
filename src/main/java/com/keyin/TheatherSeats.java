package com.keyin;

// Implement a Movie theater class that has methods to:
// Method to display the seating chart. eg 0 represents an available seat, X represents a reserved seat
// method to reserve a seat. If a seat is already reserved, tell use the seat is already taken.
// Implement a main method to test your work.




public class TheatherSeats {

    int arr[][] = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}
    };

    // create a method to display the seating chart
    public void displaySeats() {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == 0) {
                    System.out.print("O ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    // create a method to reserve a seat
    public void reserveSeat(int row, int col) {
        if (arr[row][col] == 0) { // if specific seat in row and col == 0
            arr[row][col] = 1;
            System.out.println("Seat was reserved successfully!");
        } else {
            System.out.println("Seat is already reserved. Please choose another seat.");
        }
    }

    public static void main(String[] args) {
        TheatherSeats theater = new TheatherSeats();
        theater.displaySeats(); // display the chart
        theater.reserveSeat(2, 3); // reserve the seat
        theater.displaySeats();
        theater.reserveSeat(2, 3); // reserve the same seat
        theater.displaySeats();
    }
}
