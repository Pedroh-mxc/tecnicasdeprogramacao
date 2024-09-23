/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Lista2.Ex2;

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
        Ex2 funcionario1 = new Ex2();
        
        System.out.print("Nome: ");
        funcionario1.nome = sc.next();
        System.out.print("Salario bruto: ");
        funcionario1.salario = sc.nextDouble();
        System.out.print("Importos: ");
        funcionario1.imposto = sc.nextDouble();
        
        System.out.printf("Funcionario: %s, Salario liquido: %.2f%n", funcionario1.nome, funcionario1.salLiquido());
        System.out.print("Quantos procentos o salario ira aumentar? ");
        funcionario1.aumentoSalario(0.0);
        
    }
}
