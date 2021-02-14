package exercicios;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int inicio, fim, c, totpar=0, totimp=0;
		
		System.out.println("Qual o número inicial? ");
		inicio = entrada.nextInt();
		
		System.out.println("Qual o número final? ");
		fim = entrada.nextInt();
		
		c = inicio;
		
		while (c <= fim) {
			System.out.println(c);
			c++;
			
			if (c % 2 == 0) {
				totpar++;
			} else {
				totimp++;
			}
			
			
		}
		
		System.out.println("");
		System.out.println("Total de números pares: " + totpar);
		System.out.println("Total de números ímpares: " + totimp);
		
		
		
		
		
		
		
		entrada.close();

	}

}
