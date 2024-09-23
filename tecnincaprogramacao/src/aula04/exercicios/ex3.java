package aula04.exercicios;

public class ex3 {
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
            System.out.println(x * y / z);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Operacao operacao = new Operacao(4, 3, 2);
            operacao.calcular();
        }
    }

}
