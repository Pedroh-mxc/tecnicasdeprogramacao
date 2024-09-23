package aula04.exercicios;
import java.util.Scanner;

public class ex4 {


    class Operacao {
        private int x;
        private int y;
        private int z;

        public Operacao(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public void calcular() {
            System.out.println("Resultado: " + (x * y / z));
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor de x: ");
            int x = scanner.nextInt();

            System.out.print("Digite o valor de y: ");
            int y = scanner.nextInt();

            System.out.print("Digite o valor de z: ");
            int z = scanner.nextInt();

            Operacao operacao = new Operacao(x, y, z);
            operacao.calcular();

            scanner.close();
        }
    }

}
