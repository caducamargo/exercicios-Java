package exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtp, pd;
		double porcentagem;
		
		System.out.print("Quantas pe�as foram produzidas? ");
		qtp = entrada.nextInt();
		
		System.out.print("Quantas est�o com defeitos? ");
		pd = entrada.nextInt();
		
		porcentagem = qtp * 0.10;
		
		if (porcentagem < pd) {
			System.out.println("� necess�ria manuten��o!");
		} else {
			System.out.println("N�o � necess�ria manuten��o!");
		}
		
		
		
		
		entrada.close();
	}

}
