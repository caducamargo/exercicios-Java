package exercicios;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, totn;
		
		System.out.print("Digíte a primera nota bimestral: ");
		nota1 = entrada.nextFloat();
		
		System.out.print("Digíte a segunda nota bimestral: ");
		nota2 = entrada.nextFloat();
		
		System.out.print("Digíte a terceira nota bimestral: ");
		nota3 = entrada.nextFloat();
		
		System.out.print("Digíte a quarta nota bimestral: ");
		nota4 = entrada.nextFloat();
		
		totn = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("");

		System.out.println("A média das notas bimestrais foi: " + totn);
		
		entrada.close();

	}

}
