package com.company;

public class Algorithm {
    // 中间变量,用于两个元素交换位置
    int temp;
    int SortsPerformed = 1;

    int BubbleSort(int[] myArray) {
        // 共几轮排序,每轮都是把最大的元素排在后面；负责把那个数字排除在外
        for(int i = 0; i < myArray.length; i++) {
            // 每轮排序中:需要比较的元素个数比上一轮少一个；负责两两比较交换
            // 把数组中最小的那个往上冒，冒的过程就是和他相邻的元素交换。这个冒的过程就是内循环。
            for(int j = 1; j < myArray.length - i; j++) {
                System.out.print("In search " + SortsPerformed + ": i = " + i);
                System.out.print(" Comparing: " + myArray[i] + " with others");

                SortsPerformed++;
                System.out.print(" j = " + j);
                // 交换
                if(myArray[j - 1] > myArray[j]) {
                    System.out.println(" Swapping: " + myArray[j - 1] + " and " + myArray[j]);
                    temp = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = temp;
                }
                else
                    System.out.println(" No swapping done.");
            }
        }
        return SortsPerformed;
    }
}
