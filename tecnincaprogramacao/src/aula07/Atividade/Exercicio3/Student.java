package Atividade.Exercicio3;

public class Student {
    String nome;
    double nota1;
    double nota2;
    double nota3;

    double notaFinal() {
        return nota1 + nota2 + nota3;
    }

    boolean aprovado() {
        return notaFinal() >= 60.0;
    }

    double pontosFaltando() {
        if (aprovado()) {
            return 0.0;
        } else {
            return 60.0 - notaFinal();
        }
    }

    @Override
    public String toString() {
        return String.format("FINAL GRADE = %.2f", notaFinal()) + "\n" +
                (aprovado() ? "PASS" : "FAILED\nMISSING " + String.format("%.2f", pontosFaltando()) + " POINTS");
    }
}
