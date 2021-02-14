package exercicios;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double capital, taxaf, montante;
		int periodo, x;
		
		System.out.println("Qual o capital? ");
		capital = entrada.nextDouble();
		
		System.out.println("Qual a taxa de juros mensais? ");
		taxaf = entrada.nextDouble();
		
		System.out.println("qual o periodo? ");
		periodo = entrada.nextInt();
		
		System.out.println("");
		
		/*taxaf = (taxaf / 100);*/
		
		for (x=1; x <= periodo; ++x) {
			montante = capital * Math.pow((1 + taxaf/100),periodo);
			System.out.println(" *" + x + "° mês: " + montante);
		}

		
		entrada.close();
	}

}
