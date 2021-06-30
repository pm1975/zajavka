package com.company.sortowanie;

import java.util.Arrays;

/**
 * @author piotr BINARY SEARCH
 */
public class ArraySorting_5_25 {
    public static void main(String[] args) {
        int[] array = {24, 11, 1, 54, 1, 21, 52, 46, 81, 32, 792};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 25));;
    }
}
