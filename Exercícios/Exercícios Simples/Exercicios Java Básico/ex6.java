package exercicios;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valor, antvalor, sucvalor;
		
		System.out.println("Dig�te um valor: ");
		valor = entrada.nextInt();
		
		
		antvalor = valor - 1;
		sucvalor = valor + 1;

		System.out.println("O antecessor do valor inserido � o n�mero: " + antvalor);
		System.out.println("O sucessor do valor inserido � o n�mero: " + sucvalor);
		
		
		entrada.close();
		
	}

}
