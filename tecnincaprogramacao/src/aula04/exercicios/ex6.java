package aula04.exercicios;
import java.util.Scanner;

public class ex6 {


    class Ponto {
        private double x1, y1, x2, y2;

        public Ponto(double x1, double y1, double x2, double y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public void calcularDistancia() {
            double distancia = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
            System.out.println("ponto 1: (" + x1 + "," + y1 + ")");
            System.out.println("ponto 2: (" + x2 + "," + y2 + ")");
            System.out.println("distancia é: " + distancia);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("digite a coordenada x1 ponto 1: ");
            double x1 = scanner.nextDouble();

            System.out.print("digite a coordenada y1 ponto 1: ");
            double y1 = scanner.nextDouble();

            System.out.print("digite a coordenada x2 ponto 2: ");
            double x2 = scanner.nextDouble();

            System.out.print("digite a coordenada y2 do ponto 2: ");
            double y2 = scanner.nextDouble();

            Ponto ponto = new Ponto(x1, y1, x2, y2);
            ponto.calcularDistancia();

            scanner.close();
        }
    }

}
