package exercicios;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int valor, spos=0, nneg=0;
		
		for (int c=1; c<=20; c++) {
			System.out.println("Digite o " + c + "° valor:");
			valor = entrada.nextInt();
			
			if (valor > 0) {
				spos = spos + valor;
			} else if (valor < 0) {
				nneg = nneg + 1;
			}
		}
		
		System.out.println("A soma dos números positivos é: " + spos);
		System.out.println("A quantidade de números negativos foi de: " + nneg);
		
		entrada.close();
	}

}
