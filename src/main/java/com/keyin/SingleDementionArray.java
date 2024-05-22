package com.keyin;

/**
 * 1. insert  into an Array
 * 2. Traverse an Array
 * 3. Delete Array for both (specific value as well as the whole array)
 * 4. Search for an element in an array
 */
import java.util.Arrays;
public class SingleDementionArray{
    int arr[] = null;

    public SingleDementionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToInsert){
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToInsert;
                System.out.println("Successfully inserted");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array" +  e);
        }
    }

    public void traverseArray(){
        try {
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i] + " " + "best");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists");
        }
    }

    public void searchInArray(int valueToSearch){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == valueToSearch){
                System.out.println("Value found at index: " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    public void deleteValueFromArray(int valueToDelete){
        try {
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == valueToDelete){
                    arr[i] = Integer.MIN_VALUE;
                    System.out.println("Value has been deleted");
                    return;
                }
            }
            System.out.println(valueToDelete + " is not found");
        } catch (Exception e) {
            System.out.println("Array no longer exists");
        }
    }

    public static void main(String[] args) {
        //create the object of the class
        SingleDementionArray singleDimensionArray = new SingleDementionArray(8);
        singleDimensionArray.insert(0,1);
        singleDimensionArray.insert(1,2);
        singleDimensionArray.insert(2,3);
        singleDimensionArray.insert(3,4);
        singleDimensionArray.insert(4,5);
        singleDimensionArray.insert(5,3);
        singleDimensionArray.insert(6,4);
        singleDimensionArray.insert(7,5);
//        System.out.println(singleDimensionArray.toString());
        System.out.println(Arrays.toString(singleDimensionArray.arr));
        singleDimensionArray.traverseArray();
        singleDimensionArray.searchInArray(3);
        singleDimensionArray.deleteValueFromArray(5);


    }
}

