package exercicios;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int n; 
		float calc=0;
		
		System.out.println("Dig�te seu n�mero da sorte: ");
		n = entrada.nextInt();
		
		while ( n > 0) {
			System.out.println("Dig�te um n�mero para somar: ");
			n = entrada.nextInt();
			calc = calc + n;
		}

		System.out.println("O resultado da soma �: " + calc);
		
		entrada.close();

	}

}
