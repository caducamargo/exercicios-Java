package exercicios;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float valor1, valor2, calc;
		
		System.out.print("Dig�te o primeiro valor: ");
		valor1 = entrada.nextFloat();
		
		System.out.print("Dig�te o segundo valor: ");
		valor2 = entrada.nextFloat();
		
		calc = (valor1 + valor2);
		
		System.out.println("A soma dos valores �: " + calc);
		
		entrada.close();
		

	}

}
