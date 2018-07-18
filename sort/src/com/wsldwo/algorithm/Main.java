package com.wsldwo.algorithm;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] numbers = {10, 100, -5, 7, 31, 666, 52, 300, -100};
        System.out.print("unsorted:");
        printArrays(numbers);
        //bubbleSort(numbers);
        selectSort(numbers);
        System.out.print("sorted:");
        printArrays(numbers);
    }

    /*
    冒泡排序：
    从第一个元素开始至倒数第二个元素，
    依次和身后的每一个元素作比较，
    若有更小者，则交换值。
     */
    private static void bubbleSort(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }
    /*
    选择排序：
    思想和冒泡几乎一致，
    唯一的区别在于——冒泡只要发现更小的数，就会立即交换；选择会在一次比较循环中记录下最小值下标，在循环的末尾才进行交换。
    与冒泡相比，两者比较次数相同，但是交换次数选择会少很多（n-1）。
    选择可以当作是改进后的冒泡排序。
    */
    private static void selectSort(int[] numbers) {
        int length = numbers.length;
        for (int i = 0; i < length - 1; i++) {
            int min = numbers[i];
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (min > numbers[j]) {
                    min = numbers[j];
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }
    }


    private static void printArrays(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println();
    }
}
