package exercicios;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int valor;
		double calcquad=0;
		
		
		for (valor=10; valor<=20; valor++) {
			calcquad = valor * valor;	
			System.out.println("O quadrado de " + valor + " é " + calcquad);
			}
			
		
		
		
		
		
		entrada.close();
		
	}

		
	}
