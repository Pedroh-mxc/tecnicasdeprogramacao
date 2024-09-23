package aula04.exercicios;

public class ex2 {
    class Numeros {
        private double x;
        private double y;

        public Numeros(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void exibirNumeros() {
            System.out.println(x);
            System.out.println(y);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Numeros numeros = new Numeros(3.5, 4.64);
            numeros.exibirNumeros();
        }
    }

}
