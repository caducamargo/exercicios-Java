package exercicios;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		int num = entrada.nextInt();
		
		if (num > 10) {
			System.out.println("Esse n�mero � maior que 10!");
		} else {
			System.out.println("Esse n�mero � menor que 10!");
		}

		
		entrada.close();
	}

}
