package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        System.out.print("Before Bubble Sort: ");

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Algorithm myBubbleSort = new Algorithm();
        int x = myBubbleSort.BubbleSort(arr);

        System.out.print("After  Bubble Sort: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
