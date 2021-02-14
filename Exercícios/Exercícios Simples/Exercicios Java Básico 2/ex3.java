package exercicios;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float mts, c;
		
		System.out.print("Quantos metros quer converter? ");
		mts = entrada.nextFloat();
		
		c = mts * 100;
		
		System.out.println(mts + " metros equivale a " + c + " centímetros.");
		
		entrada.close();

	}

}
