/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.Ex3;

import java.util.Scanner;

/**
 *
 * @author Pabline Pereira Santos <pablinep2006@gmail.com>
 * @date 29/08/2024
 * @brief Class $(name)
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media;
        Ex3 aluno1 = new Ex3();

        System.out.print("Qual o nome do aluno? ");
        aluno1.nome = sc.next();
        System.out.print("Nota 1: ");
        aluno1.n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        aluno1.n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        aluno1.n3 = sc.nextDouble();
        
        media=aluno1.media();
        aluno1.aprovacao(media);

    }
}
