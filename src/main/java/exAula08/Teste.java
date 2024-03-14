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

package exAula08;
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
        //esqueci se era para 
        
        /*Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo("Azul", 5, 12);
        Circulo circulo = new Circulo("Verde", 10.2);
        Retangulo retangulo = new Retangulo("Rosa", 32, 12);
        
        quadrado.setCor("Roxo");
        quadrado.setLado1(4);
        
        System.out.println(quadrado);
        System.out.println(triangulo);
        System.out.println(circulo);
        System.out.println(retangulo);*/
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();
        
          boolean sair = true;

	    do {
                exibirMenu();
	        String opcao = sc.next();
	        switch (opcao) {
		    case "1":
		    System.out.println("Digite a cor do Quadrado: ");
                    quadrado.cor = sc.next();
                    System.out.println("Digite o lado do Quadrado: ");
                    quadrado.lado1 = sc.nextDouble();
                    System.out.println(quadrado);
                    break;
		        
		    
                    case "2":
		    System.out.println("Digite a cor do Triangulo: ");
                    triangulo.cor = sc.next();
                    System.out.println("Digite a base do Triangulo: ");
                    triangulo.base = sc.nextDouble();
                    System.out.println("Digite a altura do Triangulo: ");
                    triangulo.altura = sc.nextDouble();
                    System.out.println(triangulo);	
		    break;   
		   
                    case "3":
	            System.out.println("Digite a cor do Circulo: ");
                    circulo.cor = sc.next();
                    System.out.println("Digite o raio do Circulo: ");
                    circulo.raio = sc.nextDouble();
                    System.out.println(circulo);
                    break;  
				
		    case "4":
                    System.out.println("Digite a cor do Retangulo: ");
                    retangulo.cor = sc.next();
                    System.out.println("Digite o lado1 do Retangulo: ");
                    retangulo.lado1 = sc.nextDouble();
                    System.out.println("Digite o lado2 do Retangulo: ");
                    retangulo.lado2 = sc.nextDouble();
                    System.out.println(retangulo);              
		    break;    
				
		    default:
			System.out.println("Opção inválida. Tente novamente.");
			}
            
            System.out.println("Deseja voltar ao menu principal? ");
	    System.out.print("Digite [s/n]: ");
		String resposta;
		resposta = sc.next().toLowerCase();
			
            sair = resposta.equals("s");

		} while (sair);
            
            System.out.println("Programa encerrado.");
         
    }
    
    private static void exibirMenu() {
	    System.out.println("Menu:");
	    System.out.println("1- Quadrado");
	    System.out.println("2- Triangulo");
	    System.out.println("3- Circulo");
	    System.out.println("4- Retangulo");
	    System.out.print("Escolha uma opção: ");
	}
}
