package com.company;

public class Algorithm {

    int BubbleSort(int[] myArray) {

        int temp;
        int SearchesPerformed = 1;

        for(int i = 0; i < myArray.length; i++) {
            for(int j = 1; j < (myArray.length - i); j++) {
                if(myArray[j - 1] > myArray[j]) {
                    temp = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = temp;
                    SearchesPerformed++;
                }
            }
        }
    return SearchesPerformed;
    }
}
