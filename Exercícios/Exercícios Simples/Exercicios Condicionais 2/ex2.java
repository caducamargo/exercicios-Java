package exercicios;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor1, valor2, operacao, calc;
		
		System.out.print("Dig�te o primeiro valor: ");
		valor1 = entrada.nextInt();
		
		System.out.print("Dig�te o segundo valor: ");
		valor2 = entrada.nextInt();
		
		System.out.println("Escolha qual opera��o voc� quer executar:");
		System.out.print("[1 - SOMA] / [2 - SUBTRA��O] / [3 - DIVIS�O]");
		System.out.print("/ [4 - MULTIPLICA��O] ");
		operacao = entrada.nextInt();
		
		if (operacao == 1) {
			calc = valor1 + valor2;
			System.out.println("A soma resulta em: " + calc);
		} else if (operacao == 2) {
			calc = valor1 - valor2;
			System.out.println("A subtra��o resulta em: " + calc);
		} else if (operacao == 3) {
			calc = valor1 / valor2;
			System.out.println("A divis�o resulta em: " + calc);
		} else if (operacao == 4) {
			calc = valor1 * valor2;
			System.out.println("A multiplica��o resulta em: " + calc);
		}
		
		
		entrada.close();

	}

}
