package exercicios;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int valor;
		
		for (valor=1000; valor<=1999; valor++) {
			if  (valor % 11 == 5) {
				System.out.println(valor);
			}
			
		}

		
		entrada.close();

	}

}
