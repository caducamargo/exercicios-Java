package exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtp, pd;
		double porcentagem;
		
		System.out.print("Quantas peças foram produzidas? ");
		qtp = entrada.nextInt();
		
		System.out.print("Quantas estão com defeitos? ");
		pd = entrada.nextInt();
		
		porcentagem = qtp * 0.10;
		
		if (porcentagem < pd) {
			System.out.println("É necessária manutenção!");
		} else {
			System.out.println("Não é necessária manutenção!");
		}
		
		
		
		
		entrada.close();
	}

}
