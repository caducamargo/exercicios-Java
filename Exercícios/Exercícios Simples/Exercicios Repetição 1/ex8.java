package exercicios;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int valor;
		
		for (int c=1; c<=5; c++) {
			System.out.println("Digíte o " + c + "° valor: ");
			valor = entrada.nextInt();
			
			if (valor > 0) {
				System.out.println(valor);
			}
		}

		
		
		
		entrada.close();
	}

}


