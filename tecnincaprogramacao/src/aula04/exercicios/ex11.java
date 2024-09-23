package aula04.exercicios;

public class ex11 {
    class ContadorReverso {
        private int inicio;

        public ContadorReverso(int inicio) {
            this.inicio = inicio;
        }

        public void contarReverso() {
            for (int i = inicio; i >= 1; i--) {
                System.out.println(i);
            }
        }
    }

    public class Main {
        public static void main(String[] args) {
            ContadorReverso contadorReverso = new ContadorReverso(10000);
            contadorReverso.contarReverso();
        }
    }

}
