package exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		double ipi, cd1, cd2, v1, v2, qt1, qt2, calc;

		
		System.out.println("Qual a porcentagem do IPI a ser acrescido? ");
		ipi = entrada.nextDouble();
		
		System.out.println("Digíte o código da peça 1: ");
		cd1 = entrada.nextDouble();
		
		System.out.println("Digíte o valor unitário da peça 1: ");
		v1 = entrada.nextDouble();
		
		System.out.println("Digíte a quantidade de peças 1");
		qt1 = entrada.nextDouble();
		
		System.out.println("Digíte o código da peça 2: ");
		cd2 = entrada.nextDouble();
		
		System.out.println("Digíte o valor unitário da peça 2: ");
		v2 = entrada.nextDouble();
		
		System.out.println("Digíte a quantidade de peças 2");
		qt2 = entrada.nextDouble();
		
		calc = (v1*qt1 + v2*qt2)*(ipi/100 + 1);
		
		System.out.println("O valor total a ser pago é: " + calc);
		
		entrada.close();

	}

}
