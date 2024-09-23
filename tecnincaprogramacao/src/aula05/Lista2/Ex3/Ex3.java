/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2.Ex3;

/**
 *
 * @author Pedro Henrique Maximo Cardoso <socialpedrohmxc@gmail.com>
 * @date 29/08/2024
 * @brief Class $(name)
 */
public class Ex3 {

    String nome;
    double n1, n2, n3;

    double media() {
        return n1 + n2 + n3;
    }

    void aprovacao(double media) {
        if (media >= 60) {
            System.out.printf("Pass \nNota final: %.2f",media);  
        } else {
            System.out.printf("Faild \nNota final: %.2f \nFalta %.2f para aprovacao",media,60-media);   
        }
    }
}
