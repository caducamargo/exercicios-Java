package exercicios;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		double sminimo = 1045.00;
		Double susuario, qts;
		
		System.out.print("Dig�te o sal�rio do usu�rio: ");
		susuario = entrada.nextDouble();
		
		qts = susuario / sminimo;
		
		Integer qtsnew = qts.intValue();
		
		System.out.println("O usu�rio recebe: " + qtsnew + " sal�rios m�nimos.");
		
		
		entrada.close();
		
		
		
		
	}

}
