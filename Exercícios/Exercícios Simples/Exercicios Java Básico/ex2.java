package exercicios;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		float valor1, valor2, valor3, valor4, totn;
		
		System.out.print("Dig�te a primera nota: ");
		valor1 = entrada.nextFloat();
		
		
		System.out.print("Dig�te a segunda nota: ");
		valor2 = entrada.nextFloat();
		
		System.out.print("Dig�te a terceira nota: ");
		valor3 = entrada.nextFloat();
		
		System.out.print("Dig�te a quarta nota: ");
		valor4 = entrada.nextFloat();
		
		totn = (valor1 + valor2 + valor3 + valor4) / 4;

		System.out.println("A m�dia das notas foi: " + totn);
		
		entrada.close();
		
	}
		
	
	
	
}
