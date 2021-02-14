package exercicios;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int valor, somavalor=0;
		
		for (int c=1; c<=10; c++) {
			System.out.println("Digite o " + c + "° valor:");
			valor = entrada.nextInt();
			
		somavalor = somavalor + valor;
			

		
		
	}

		
		System.out.println("A soma dos valores é: " + somavalor);
		
		entrada.close();
		
	}

}