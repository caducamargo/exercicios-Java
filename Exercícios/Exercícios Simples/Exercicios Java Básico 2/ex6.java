package exercicios;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float valorh, horast, calcsal;
		
		System.out.print("Quanto você ganha por horas trabalhadas? ");
		valorh = entrada.nextFloat();
		
		System.out.print("Quantas horas você trabalha por mês? ");
		horast = entrada.nextFloat();
		
		calcsal = horast * valorh;
		
		System.out.println("Seu salário mensal é de: R$" + calcsal);
		
		

	}

}
