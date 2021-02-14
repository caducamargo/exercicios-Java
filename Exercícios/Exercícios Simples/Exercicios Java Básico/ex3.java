package exercicios;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double saldo;
		
		System.out.println("Digíte o saldo: ");
		saldo = entrada.nextDouble();
		
		saldo += saldo * .01;
		
		System.out.println("Seu valor com reajuste é: " + saldo);
		
		
		entrada.close();

	}

}
