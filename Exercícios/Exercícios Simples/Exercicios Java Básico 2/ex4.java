package exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double raio, area;
		
		System.out.print("Qual o raio do c�rculo? ");
		raio = entrada.nextFloat();
		
		area = 3.1416 * raio * raio;
		
		System.out.println("A �rea do c�rculo �: " + area);
		
		entrada.close();
	
	}

}
