package exercicios;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, totn;
		
		System.out.print("Dig�te a primera nota bimestral: ");
		nota1 = entrada.nextFloat();
		
		System.out.print("Dig�te a segunda nota bimestral: ");
		nota2 = entrada.nextFloat();
		
		System.out.print("Dig�te a terceira nota bimestral: ");
		nota3 = entrada.nextFloat();
		
		System.out.print("Dig�te a quarta nota bimestral: ");
		nota4 = entrada.nextFloat();
		
		totn = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("");

		System.out.println("A m�dia das notas bimestrais foi: " + totn);
		
		entrada.close();

	}

}
