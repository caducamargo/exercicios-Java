package exercicios;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int n; 
		float calc=0;
		
		System.out.println("Digíte seu número da sorte: ");
		n = entrada.nextInt();
		
		while ( n > 0) {
			System.out.println("Digíte um número para somar: ");
			n = entrada.nextInt();
			calc = calc + n;
		}

		System.out.println("O resultado da soma é: " + calc);
		
		entrada.close();

	}

}
