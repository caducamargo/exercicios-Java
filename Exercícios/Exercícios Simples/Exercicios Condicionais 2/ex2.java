package exercicios;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor1, valor2, operacao, calc;
		
		System.out.print("Digíte o primeiro valor: ");
		valor1 = entrada.nextInt();
		
		System.out.print("Digíte o segundo valor: ");
		valor2 = entrada.nextInt();
		
		System.out.println("Escolha qual operação você quer executar:");
		System.out.print("[1 - SOMA] / [2 - SUBTRAÇÃO] / [3 - DIVISÃO]");
		System.out.print("/ [4 - MULTIPLICAÇÃO] ");
		operacao = entrada.nextInt();
		
		if (operacao == 1) {
			calc = valor1 + valor2;
			System.out.println("A soma resulta em: " + calc);
		} else if (operacao == 2) {
			calc = valor1 - valor2;
			System.out.println("A subtração resulta em: " + calc);
		} else if (operacao == 3) {
			calc = valor1 / valor2;
			System.out.println("A divisão resulta em: " + calc);
		} else if (operacao == 4) {
			calc = valor1 * valor2;
			System.out.println("A multiplicação resulta em: " + calc);
		}
		
		
		entrada.close();

	}

}
