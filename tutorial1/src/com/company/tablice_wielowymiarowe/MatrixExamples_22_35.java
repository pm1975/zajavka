package com.company.tablice_wielowymiarowe;

/**
 * @author piotr
 */
public class MatrixExamples_22_35 {
    public static void main(String[] args) {
        MatrixExamples_22_35 examples = new MatrixExamples_22_35();

        int[][] explicitMatrix = {
                {0, 8, 2},
                {2, 5, 1}
        };

    }

    private void breakExample(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.printf(("%5d" + matrix[row][column]));
            }
        }
    }
}
