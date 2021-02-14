package exercicios;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int lado1, lado2, lado3;
		
		System.out.print("Insira o primeiro lado: ");
		lado1 = entrada.nextInt();
		
		System.out.print("Insira o segundo lado: ");
		lado2 = entrada.nextInt();
		
		System.out.print("Insira o terceiro lado: ");
		lado3 = entrada.nextInt();
		
		
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println ("É um triângulo Equilátero!");
		} else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
			System.out.println("É um triângulo Escaleno!");
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("É um triângulo Isósceles!");
		} else {
			System.out.println("Isso não pode ser um triângulo");
		}
		
		
		
		entrada.close();

	}

}
