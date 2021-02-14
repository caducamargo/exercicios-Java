package exercicios;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String nomes;
		int notas;
		float media, tot=0;
		
		for (int c=1; c<=10; c++) {
			System.out.println("Digite o nome do " + c + "° aluno: ");
			nomes = entrada.next();
	}

		for (int c=1; c<=10; c++) {
			System.out.println("Digite a nota do " + c + "° aluno: ");
			notas = entrada.nextInt();
			tot += notas;
	}
		
		media = tot / 10;
		
		
		System.out.println("A média das notas é: " + media);
		
		
		entrada.close();
		
		
	}
}
