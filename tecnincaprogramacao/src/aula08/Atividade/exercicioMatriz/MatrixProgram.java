package Atividade.exercicioMatriz;

import java.util.Scanner;

public class MatrixProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" ");
        int m = sc.nextInt();
        System.out.print(" ");
        int n = sc.nextInt();

        Matrix matrix = new Matrix(m, n);

        System.out.println(" ");
        matrix.fillMatrix(sc);

        System.out.print(" ");
        int x = sc.nextInt();

        matrix.findOccurrences(x);

        sc.close();
    }
}

