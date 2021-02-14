package exercicios;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double n, calc;
		
		System.out.println("Digite um número:");
		n = entrada.nextDouble();
		
		if (n > 20) {
			calc = n / 2;
			System.out.println("A metade desse número é: " + calc);
		}else {
			System.out.println("Menor que 20!");
		}
		
		entrada.close();

	}

}
