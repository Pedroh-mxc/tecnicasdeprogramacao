package aula04.exercicios;
import java.util.Scanner;

public class ex15 {


    class MatrizQuadrada {
        private int[][] matriz;

        public MatrizQuadrada(int n) {
            matriz = new int[n][n];
        }

        public void preencherMatriz(Scanner scanner) {
            System.out.println("digite os elementos da matriz:");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = scanner.nextInt();
                }
            }
        }

        public void exibirDiagonalSecundaria() {
            System.out.println("diagonal secundaria:");
            for (int i = 0; i < matriz.length; i++) {
                System.out.println(matriz[i][matriz.length - 1 - i]);
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("digite o tamanho da matriz quadrada (n): ");
            int n = scanner.nextInt();

            MatrizQuadrada matrizQuadrada = new MatrizQuadrada(n);
            matrizQuadrada.preencherMatriz(scanner);
            matrizQuadrada.exibirDiagonalSecundaria();

            scanner.close();
        }
    }

}
