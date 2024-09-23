package aula04.exercicios;
import java.util.Scanner;

public class ex12 {


    class Multiplicador {
        private int x;
        private int y;

        public Multiplicador(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void multiplicar() {
            int resultado = 0;
            for (int i = 1; i <= y; i++) {
                resultado += x;
            }
            System.out.println("o valor de " + x + " multiplicado por " + y + " vai ser igual a " + resultado);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("insira o valor de x: ");
            int x = scanner.nextInt();

            System.out.print("insira o valor de y: ");
            int y = scanner.nextInt();

            Multiplicador multiplicador = new Multiplicador(x, y);
            multiplicador.multiplicar();

            scanner.close();
        }
    }

}
