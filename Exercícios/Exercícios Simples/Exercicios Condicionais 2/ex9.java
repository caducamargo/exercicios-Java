package exercicios;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		double valorproduto, calc;
		
		System.out.print("Digíte o valor da compra: ");
		valorproduto = entrada.nextDouble();
		
		if (valorproduto <= 250) {
			System.out.println("O valor a ser pago é: " + valorproduto);
		} else if (valorproduto > 250) {
			calc = valorproduto / 5;
			System.out.println("O valor pode ser pago em 5x no valor de: " + calc);
		}
		
		
		entrada.close();

	}

}
