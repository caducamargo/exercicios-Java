package exercicios;

import java.util.Scanner;

public class ex7 {
	
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		int qtd;
		double calc;
		
		System.out.print("Quantas c�pias voc� quer? ");
		qtd = entrada.nextInt();
		
		if (qtd <= 100) {
			calc = qtd * 0.25;
		} else {
			calc = qtd * 0.20;
		}
		
		System.out.println("O valor de " + qtd + " c�pias �: " + calc);
		
		
		
		entrada.close();
		
	}

}
