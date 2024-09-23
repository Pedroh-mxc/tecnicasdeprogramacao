package aula04.exercicios;
import java.util.Scanner;

public class ex5 {


    class Viagem {
        private int velocidade;
        private int tempo;

        public Viagem(int velocidade, int tempo) {
            this.velocidade = velocidade;
            this.tempo = tempo;
        }

        public void calcularDistancia() {
            int distancia = velocidade * tempo;
            System.out.println("velocidade: " + velocidade + " km/h");
            System.out.println("tempo gasto: " + tempo + " horas");
            System.out.println("distancia percorrida: " + distancia + " km");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("digite a velocidade em kilometros por hora: ");
            int velocidade = scanner.nextInt();

            System.out.print("digite o tempo da viagem em horas: ");
            int tempo = scanner.nextInt();

            Viagem viagem = new Viagem(velocidade, tempo);
            viagem.calcularDistancia();

            scanner.close();
        }
    }

}
