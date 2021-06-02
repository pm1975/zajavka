package com.company.sortowanie;

import java.util.Arrays;

/**
 * @author piotr
 */
public class ArrayString_10_40 {
    public static void main(String[] args) {
        int[] array = {24, 11, 54, 6, 2, 1};
        System.out.println("Non sorted array: " + Arrays.toString(array));
        System.out.println();
        bubbleSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    System.out.println("Swap: " + Arrays.toString(array));
                } else {
                    System.out.println("Don't Swap: " + array[j - 1] + " and " + array[j]);
                }
            }
            System.out.println(i + " i iteration: " + Arrays.toString((array)));
            System.out.println();
        }
    }
}
