package exercicios;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idade = entrada.nextInt();
		
		if (idade <=10) {
			System.out.println("Infantil");
		} else if (idade <= 17) {
			System.out.println("Juvenil");
		} else if(idade > 17) {
			System.out.println("Sênior");
		} else {
			System.out.println("Invalido");
		}

		
		entrada.close();
	}

}
