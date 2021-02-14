package exercicios;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor, antvalor, sucvalor;
		
		System.out.println("Digíte um valor: ");
		valor = entrada.nextInt();
		
		
		antvalor = valor - 1;
		sucvalor = valor + 1;

		System.out.println("O antecessor do valor inserido é o número: " + antvalor);
		System.out.println("O sucessor do valor inserido é o número: " + sucvalor);
		
		
		entrada.close();
		
	}

}
