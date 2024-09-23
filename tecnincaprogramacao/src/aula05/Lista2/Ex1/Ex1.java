/*
 * Copyright (C) 2024 Pedro Henrique Maximo Cardoso <socialpedrohmxc@gmail.com>
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
package aula05.Lista2.Ex1;

/**
 *
 * @author Pedro Henrique Maximo Cardoso <socialpedrohmxc@gmail.com>
 * @date 29/08/2024
 * @brief Class $(name)
 */
public class Ex1 {

    double A;
    double L;

    double area() {
        return A * L;
    }

    double perimetro() {
        return 2 * (A + L);
    }

    double diagonal() {
        return Math.sqrt(Math.pow(A, 2)+Math.pow(L, 2)) ;
    }

}
