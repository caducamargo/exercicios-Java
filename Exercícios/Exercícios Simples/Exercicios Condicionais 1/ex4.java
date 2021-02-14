package exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu sexo [F - FEMININO] / [M - MASCULINO]:");
		String letra = entrada.next();
		
		if (letra.equals("M") || letra.equals("m")) {
			System.out.println("Você e do sexo masculino");
		} else if (letra.equals("F") || letra.equals("f")) {
			System.out.println("Você e do sexo feminino ");
		} else {
			System.out.println("Sexo Inválido ");
		}

		
		entrada.close();
	}

}
