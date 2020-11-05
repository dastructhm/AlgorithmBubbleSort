package com.company;

public class Main {

    public static void main(String[] args) {
        SetLength myArrayLength = new SetLength();
        int arrayLength = myArrayLength.SetMyArrayLength();

        int[] myArray = new int[arrayLength];

        InputElements myElements = new InputElements();
        myElements.SetElements(arrayLength, myArray);

        System.out.print("Original Array: ");

        for (int element : myArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        Algorithm myBubbleSort = new Algorithm();
        int SearchesPerformed = myBubbleSort.BubbleSort(myArray);

        System.out.print("Sorted Array: ");

        for (int element : myArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Sorts Performed: " + (SearchesPerformed - 1));
    }
}
