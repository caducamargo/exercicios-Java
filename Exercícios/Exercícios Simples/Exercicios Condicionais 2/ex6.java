package exercicios;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char turno;
		
		System.out.println("Em qual turno você estuda? ");
		System.out.println("[M - MATUTINO] / [V - VESPERTINO] / [N - NOTURNO] : ");
		turno = entrada.next().charAt(0);
		
		if (turno == 'M' || turno == 'm') {
			System.out.println("BOM DIA!");
		} else if (turno == 'V' || turno == 'v'){
			System.out.println("BOA TARDE!");
		} else if (turno == 'N' || turno == 'n') {
			System.out.println("BOA NOITE!");
		}
		
		
		
		
		
		entrada.close();

	}

}
