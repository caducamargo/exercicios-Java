package exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int base, expoente; 
		double calcpot = 0, soma1=0, soma2=0;
		
		System.out.println("Digíte o valor da Base: ");
		base = entrada.nextInt();
		
		System.out.println("Digíte o valor do Expoente: ");
		expoente = entrada.nextInt();
	
		
		if (expoente == 2) {
		for (int c = 1; c <= expoente; c++) {
		calcpot = base * base;
		soma2 = calcpot;
		
		}
				
			} else if (expoente != 2) {
			for (int c = 0; c <= expoente; c++) {
			calcpot = base * base;	
			soma1 = soma1 + calcpot;
			soma2 = soma1 * base;
		
		}
		
			
			
		}
		
		
		
		System.out.println("O resultado da potência é: " + soma2);
		
		entrada.close();
		

	}

}
