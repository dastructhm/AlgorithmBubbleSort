package com.company;

public class Algorithm {
    // 中间变量,用于两个元素交换位置
    int temp;
    int SortsPerformed = 1;

    int BubbleSort(int[] myArray) {
        // 把下标1的数值与右边的数值对比：控制本轮被排序的元素
        for(int i = 0; i < myArray.length; i++) {
            // 把该数值向右移动，直至移动到最大的下标处：控制位置
            for(int j = 1; j < myArray.length - i; j++) {
                System.out.print("In sorting " + SortsPerformed + ": i = " + i);
                System.out.print(", j = " + j);
                System.out.print(", Comparing " + myArray[j - 1] + " with right-side neighbours");

                SortsPerformed++;

                // 交换
                if(myArray[j - 1] > myArray[j]) {
                    System.out.println(", Swapping: " + myArray[j - 1] + " and " + myArray[j]);
                    temp = myArray[j - 1];
                    myArray[j - 1] = myArray[j];
                    myArray[j] = temp;
                }
                else
                    System.out.println(", No swapping needed.");
            }
        }
        return SortsPerformed;
    }
}
