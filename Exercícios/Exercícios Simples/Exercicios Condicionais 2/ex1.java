package exercicios;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor1, valor2, valor3;
		
		System.out.print("Dig�te o primeiro valor: ");
		valor1 = entrada.nextInt();
		
		System.out.print("Dig�te o segundo valor: ");
		valor2 = entrada.nextInt();
		
		System.out.print("Dig�te o terceiro valor: ");
		valor3 = entrada.nextInt();
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("O maior valor digitado �: " + valor1);
			
			
		} else if (valor2 > valor1 && valor2 > valor3) { 
			System.out.println("O maior valor digitado �: " + valor2);
			
			
		} else if (valor3 > valor1 && valor3 > valor2) {
			System.out.println("O maior valor digitado �: " + valor3);
		}


		entrada.close();
	}

}
