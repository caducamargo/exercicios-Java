package exercicios;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num = entrada.nextInt();
		
		if (num > 10) {
			System.out.println("Esse número é maior que 10!");
		} else {
			System.out.println("Esse número é menor que 10!");
		}

		
		entrada.close();
	}

}
