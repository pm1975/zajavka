package com.company.sortowanie;

import java.util.Arrays;

/**
 * @author piotr
 */
public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {24, 11, 1, 54, 1, 2, 2, 4, 8, 3, 7};
        System.out.println(array.length);
        System.out.println("Before sorting");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(array));
    }
}
