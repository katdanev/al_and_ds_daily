package com.keyin;

import java.util.Arrays;

public class TwoDementionalArray {
    int arr[][] = null; // ініціалізація двовимірного масиву


    public TwoDementionalArray(int numberofRows, int numberofCols){ // конструктор класу

        this.arr = new int[numberofRows][numberofCols]; // ініціалізація двовимірного масиву з вказаною кількістю рядків та стовпців
        for(int row = 0; row < arr.length; row++){ // цикл для ініціалізації кожного елементу масиву
            for(int col = 0; col < arr[0].length; col++){
                arr[row][col] = Integer.MIN_VALUE; // ініціалізація кожного елементу масиву значенням Integer.MIN_VALUE
            }
        }
    }

// need to create a method to insert a value in the array

    public void insertValueInTheArray(int row, int col, int value){ // метод для вставки значення в масив
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {// перевірка чи елемент масиву має значення Integer.MIN_VALUE
                arr[row][col] = value; // вставка значення в масив
                System.out.println("Successfully inserted value " ); // виведення повідомлення про успішну вставку значення в масив
            } else {
                System.out.println("This cell is already occupied"); // виведення повідомлення про те, що ця комірка вже зайнята
            }

        } catch (ArrayIndexOutOfBoundsException e) { // обробка помилки виходу за межі масиву
            System.out.println("Invalid index to access array" +  e); // виведення повідомлення про помилку доступу до масиву
        }
    }

    public void traverse() { // метод для перегляду масиву
        for(int row = 0; row < arr.length; row++){ // цикл для ініціалізації кожного елементу масиву
            for(int col = 0; col < arr[0].length; col++){
                System.out.println(arr[row][col] + " "); // виведення кожного елементу масиву}
            }
            System.out.println();
        }

    }

    public void searchingValue(int value) {
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[0].length; col++){
                if(arr[row][col] == value){
                    System.out.println("Value found at row " + row + " and column " + col); // виведення повідомлення про знайдене значення
                    return;
                }
            }
        }
        System.out.println("Value not found"); // виведення повідомлення про те, що значення не знайдено
    }

    public void deleteValueFromArray(int row, int col) {
        try {
            arr[row][col] = Integer.MIN_VALUE; // видалення значення з масиву
            System.out.println("Value has been deleted" + arr[row][col]); // виведення повідомлення про видалення значення
        } catch (ArrayIndexOutOfBoundsException e) { // обробка помилки виходу за межі масиву
            System.out.println("Invalid index to access array" ); // виведення повідомлення про помилку доступу до масиву
        }
    }

    public static void main(String[] args) {
        TwoDementionalArray twoDementionalArray = new TwoDementionalArray(3, 3); // створення об'єкту класу TwoDementionalArray з вказаною кількістю рядків та стовпців

        // Виведення початкового стану масиву
        System.out.println("Initial array:");
        twoDementionalArray.traverse();

        // Вставка значення у масив
        twoDementionalArray.insertValueInTheArray(1, 1, 10); // успішна вставка
        twoDementionalArray.insertValueInTheArray(1, 1, 20); // невдала вставка (комірка вже зайнята)

        // Пошук значення у масиві
        twoDementionalArray.searchingValue(10); // успішний пошук
        twoDementionalArray.searchingValue(20); // успішний пошук
        twoDementionalArray.searchingValue(30); // значення не знайдено

        // Видалення значення з масиву
        twoDementionalArray.deleteValueFromArray(1, 1); // успішне видалення
        twoDementionalArray.deleteValueFromArray(2, 2); // невдале видалення (виходить за межі масиву)

        // Виведення оновленого стану масиву
        System.out.println("Updated array:");
        twoDementionalArray.traverse();
    }


}
