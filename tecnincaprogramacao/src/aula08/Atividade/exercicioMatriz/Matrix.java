package Atividade.exercicioMatriz;

import java.util.Scanner;

public class Matrix {
    private int[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
    }

    public void fillMatrix(Scanner sc) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public void findOccurrences(int x) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if (j < cols - 1) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if (i < rows - 1) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
        }
    }
}
