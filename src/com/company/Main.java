package com.company;

public class Main {

    public static void main(String[] args) {
        // int[] myArray = { 11, 5, 1, 611, 2};

        SetLength myArrayLength = new SetLength();
        int arrayLength = myArrayLength.SetMyArrayLength();

        int[] myArray = new int[arrayLength];

        InputElements myElements = new InputElements();
        myElements.SetElements(arrayLength, myArray);

        System.out.print("Before Bubble Sort: ");

        for (int element : myArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        Algorithm myBubbleSort = new Algorithm();
        int SearchesPerformed = myBubbleSort.BubbleSort(myArray);

        System.out.print("After Bubble Sort: ");

        for (int element : myArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("Searches Performed: " + SearchesPerformed);
    }
}
