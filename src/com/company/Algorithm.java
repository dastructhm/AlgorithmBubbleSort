package com.company;

public class Algorithm {

    int BubbleSort(int[] myArray) {
        // 中间变量,用于两个元素交换位置
        int temp;
        int SortsPerformed = 1;

        // 共几轮排序,每轮都是把最大的元素排在后面
        for(int i = 0; i < myArray.length; i++) {
            // 每轮排序中:需要比较的元素个数比上一轮少一个
            // 把数组中最小的那个往上冒，冒的过程就是和他相邻的元素交换。这个冒的过程就是内循环。
            for(int j = 1; j < (myArray.length - i); j++) {
                if(myArray[j - 1] > myArray[j]) {
                    temp = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = temp;
                    SortsPerformed++;
                }
            }
        }
    return SortsPerformed;
    }
}
