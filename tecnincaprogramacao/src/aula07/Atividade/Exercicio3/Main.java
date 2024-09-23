package Atividade.Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student aluno = new Student();

        System.out.print(" ");
        aluno.nome = sc.nextLine();

        System.out.print(" ");
        aluno.nota1 = sc.nextDouble();

        System.out.print(" ");
        aluno.nota2 = sc.nextDouble();

        System.out.print(" ");
        aluno.nota3 = sc.nextDouble();

        System.out.println();
        System.out.println(aluno);

        sc.close();
    }
}

