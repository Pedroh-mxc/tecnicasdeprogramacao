/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Copyright (c) 2024 Pedro Henrique Maximo Cardoso <@pedromaximo2fieg.com.br>
 *
 * Licensed under the [Nome da Licença] (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Created on: 09/09/2024
 * Author: Pedro Henrique Maximo Cardoso
 */
package main.java.Ex1;

import java.util.Scanner;

public class Prova1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        int opcao;

        do {
            System.out.println("Forneça uma opção: \n" +
                    "1 - café expresso; \n" +
                    "2 - café capuccino; \n" +
                    "3 - leite com café; \n" +
                    "4 - totalizar vendas;");
            opcao = sc.nextInt();

            if (opcao == 4) {
                maquina.exibirRelatorio();
            } else {
                maquina.venderCafe(opcao);
            }
        } while (opcao != 4);

        sc.close();
    }
}