package exercicios;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro n�mero:");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		int num2 = entrada.nextInt();
		
		if  (num1 > num2) {
			System.out.println("O maior numero �:" + num1);
		} else {
			System.out.println("O maior numero �:" + num2);
		}
		
		entrada.close();

	}

}
