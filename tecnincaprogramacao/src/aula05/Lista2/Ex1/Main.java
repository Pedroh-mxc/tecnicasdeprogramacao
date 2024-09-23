/*
 * Copyright (C) 2024 Pabline Pereira Santos <pablinep2006@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package aula09.Ex1;

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

        Ex1 retangulo = new Ex1();

        System.out.print("Qual e a altura do retangulo? ");
        retangulo.A = sc.nextDouble();
        System.out.print("Qual e a largura do retangulo? ");
        retangulo.L = sc.nextDouble();

        System.out.println("Area: " + retangulo.area());
        System.out.println("Perimetro: " + retangulo.perimetro());
        System.out.println("Diagonal: " + retangulo.diagonal());

    }
}
