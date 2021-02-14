package exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double raio, area;
		
		System.out.print("Qual o raio do círculo? ");
		raio = entrada.nextFloat();
		
		area = 3.1416 * raio * raio;
		
		System.out.println("A área do círculo é: " + area);
		
		entrada.close();
	
	}

}
