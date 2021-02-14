package exercicios;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float p1, p2, p3;
		
		System.out.print("Digíte o valor do primeiro produto: ");
		p1 = entrada.nextFloat();
		
		System.out.print("Digíte o valor do segundo produto: ");
		p2 = entrada.nextFloat();
		
		System.out.print("Digíte o valor do terceiro produto: ");
		p3 = entrada.nextFloat();
		
		
		if (p1 > p2 && p2 > p3) {
			System.out.println("O produto mais barato e recomendado é o de R$" + p3);
		} else if (p1 > p3 && p3 > p2) {
			System.out.println("O produto mais barato e recomendado é o de R$" + p2);
		} else if (p2 > p1 && p1 > p3) {
			System.out.println("O produto mais barato e recomendado é o de R$" + p3);
		} else if (p2 > p3 && p3 > p1) {
			System.out.println("O produto mais barato e recomendado é o de R$" + p1);
		} else if (p3 > p1 && p1 > p2) {
			System.out.println("O produto mais barato e recomendado é o de R$" + p2);
		} else if (p3 > p2 && p2 > p1) {
			System.out.println("O produto mais barato e recomendado é o de R$" + p1);
		}
		
		

		
		entrada.close();
	}

}
