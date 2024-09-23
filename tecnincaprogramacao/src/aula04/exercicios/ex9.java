package aula04.exercicios;
import java.util.Scanner;

public class ex9 {


    class Triangulo {
        private double a;
        private double b;
        private double c;

        public Triangulo(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public void identificarTipo() {
            if (a == b && b == c) {
                System.out.println("o triangulo é equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("o triangulo é isósceles.");
            } else {
                System.out.println("o triangulo é escaleno.");
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("digite o tamanho do lado a: ");
            double a = scanner.nextDouble();

            System.out.print("digite o tamanho do lado b: ");
            double b = scanner.nextDouble();

            System.out.print("digite o tamanho do lado c: ");
            double c = scanner.nextDouble();

            Triangulo triangulo = new Triangulo(a, b, c);
            triangulo.identificarTipo();

            scanner.close();
        }
    }

}
