package exercicios;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		double sminimo = 1045.00;
		Double susuario, qts;
		
		System.out.print("Digíte o salário do usuário: ");
		susuario = entrada.nextDouble();
		
		qts = susuario / sminimo;
		
		Integer qtsnew = qts.intValue();
		
		System.out.println("O usuário recebe: " + qtsnew + " salários mínimos.");
		
		
		entrada.close();
		
		
		
		
	}

}
