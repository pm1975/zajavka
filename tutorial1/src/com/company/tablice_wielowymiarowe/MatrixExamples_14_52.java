package com.company.tablice_wielowymiarowe;

/**
 * @author piotr
 */
public class MatrixExamples_14_52 {
    public static void main(String[] args) {
        MatrixExamples_14_52 examples = new MatrixExamples_14_52();

        int[][] matrix = examples.createMatrix(5, 5);
        examples.printMatrix(matrix);
        examples.printSummedRows(matrix);
        examples.printLargestNumberInRow(matrix);
    }

    private int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = generateRandomValue();
            }
        }
        return matrix;
    }

    private int generateRandomValue() {
        int min = 0;
        int max = 10;
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    private void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%5d", element);
            }
            System.out.println();
        }
    }

    private void printSummedRows(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int column = 0; column < matrix[row].length; column++) {
                sum += matrix[row][column];
            }
            System.out.println("Row nr: " + row + " sum => " + sum);
        }
    }

    private void printLargestNumberInRow(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int largest = matrix[row][0];
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] > largest) {
                    largest = matrix[row][column];
                }
            }
            System.out.println("row nr: " + row + " largest element => " + largest);
        }
    }
}
