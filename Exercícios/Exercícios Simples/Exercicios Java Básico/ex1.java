package exercicios;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		short anos, meses, dias;
		
		System.out.print("Anos: ");
		anos = entrada.nextShort();
		
		System.out.print("meses: ");
		meses = entrada.nextShort();
		
		System.out.print("dias: ");
		dias = entrada.nextShort();
		
		dias += (anos * 365) + (meses * 30);
		
		
		System.out.println("Sua idade em dias é: " + dias);	
		
		
		entrada.close();

	}

}
