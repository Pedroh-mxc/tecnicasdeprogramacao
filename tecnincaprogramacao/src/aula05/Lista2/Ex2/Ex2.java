/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Lista2.Ex2;

import java.util.Scanner;

/**
 *
 * @author Pedro Henrique Maximo Cardoso <socialpedrohmxc@gmail.com>
 * @date 29/08/2024
 * @brief Class $(name)
 */
public class Ex1 {
    String nome;
    double salario;
    double imposto;
    
    double salLiquido(){
        return salario-imposto;
    }
    void aumentoSalario(double porcento){
        Scanner sc= new Scanner(System.in);
        porcento=sc.nextDouble();
        salario=salario*porcento/100+salario-imposto;
        System.out.format("Updated data: %s, $ %.2f%n", nome, salario);
    }
            
}
