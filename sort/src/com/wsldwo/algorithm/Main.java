package com.wsldwo.algorithm;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] numbers = {10, 100, -5, 7, 31, 666, 52, 300, -100};
        System.out.print("unsorted:");
        printArrays(numbers);
        bubbleSort(numbers);
        System.out.print("sorted:");
        printArrays(numbers);
    }

    /*
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

    private static void printArrays(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println();
    }
}
