package aula04.exercicios;
import java.util.Scanner;

public class ex8 {


    class Comparador {
        private double a;
        private double b;

        public Comparador(double a, double b) {
            this.a = a;
            this.b = b;
        }

        public void exibirMaior() {
            double maior = (a >= b) ? a : b;
            System.out.println("valor de a: " + a);
            System.out.println("valor de b: " + b);
            System.out.println("maior: " + maior);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("digite o valor de a: ");
            double a = scanner.nextDouble();

            System.out.print("digite o valor de b: ");
            double b = scanner.nextDouble();

            Comparador comparador = new Comparador(a, b);
            comparador.exibirMaior();

            scanner.close();
        }
    }

}
