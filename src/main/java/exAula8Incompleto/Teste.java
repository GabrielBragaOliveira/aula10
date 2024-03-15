/*
 * Copyright (C) 2024 Gabriel Braga <ninjagamer9795286@gmail.com>
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

package exAula8Incompleto;
import exAula08.*;
import java.util.*;
/**
 *
 * @author Gabriel Braga <ninjagamer9795286@gmail.com>
 * @date 12/03/2024
 * @brief Class Teste
 */
public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo("Azul", 5, 12);
        Circulo circulo = new Circulo("Verde", 10.2);
        Retangulo retangulo = new Retangulo("Rosa", 32, 12);
        
        quadrado.setCor("Roxo");
        quadrado.setLado1(4);
        
        System.out.println(quadrado);
        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println(retangulo);
    }
}
