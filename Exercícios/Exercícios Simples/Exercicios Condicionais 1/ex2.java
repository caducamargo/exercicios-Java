package exercicios;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num = entrada.nextInt();
		
		if (num >= 0) {
			System.out.println("Positivo!");
		}else {
			System.out.println("Negativo!");
		}
		
		
		entrada.close();

	}

}
