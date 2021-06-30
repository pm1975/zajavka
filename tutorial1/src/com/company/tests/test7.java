package com.company.tests;

import java.util.Arrays;

/**
 * @author piotr
 */
public class test7 {
    public static void main(String[] args) {
        {
            int[] arr = new int[2];
            int size = arr.length;
        }
        {
            int[][] arr = {{1, 2, 3}, {5, 0, 7}, {4, 3, 8, 2}};
            System.out.println(arr[1]);
        }
        {
            int[] arr = {1, -2, 5, 10, -14, -2};
            int search = 5;
            int result = Arrays.binarySearch(arr, search);
            System.out.println(result);
        }
        {
            int result = 0;
            int[][] arr = {{1, 2, 2}, {5, 0, 7}, {4, 3, 8, 2}};
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    result += arr[i][j++];
                }
                result -= arr[i][0];
            }
            System.out.println(result);
        }
        varArgsExample(1, new int[]{1,2,3});
    }

    public static int varArgsExample(int arg, int... varArgs) {
        return varArgs.length;
    }
}
