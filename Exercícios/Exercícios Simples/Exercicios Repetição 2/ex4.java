package exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int valor;
		
		for (valor=1; valor<=50; valor+=2) {
			System.out.println(valor);
		}

		
		entrada.close();

	}

}
