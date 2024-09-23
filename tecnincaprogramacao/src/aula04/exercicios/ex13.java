package aula04.exercicios;

public class ex13 {
    class ContadorPrimos {
        private int limite;

        public ContadorPrimos(int limite) {
            this.limite = limite;
        }

        public void contarPrimos() {
            int numprimos = 0;

            for (int num = 2; num <= limite; num++) {
                boolean ehPrimo = true;
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
                if (ehPrimo) {
                    numprimos++;
                }
            }
            System.out.println("a quantidade de números primos entre 1 e " + limite + ": " + numprimos);
        }
    }

    public class Main {
        public static void main(String[] args) {
            ContadorPrimos contadorPrimos = new ContadorPrimos(1000);
            contadorPrimos.contarPrimos();
        }
    }

}
