package exercicios;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int qtjog;
		float altjog, alturas=0, somamedia;
		
		System.out.println("Quantos jogadores t�m no time? ");
		qtjog = entrada.nextInt();
		
		
		for (int c=1; c<=qtjog; c++) {
			System.out.println("Qual a altura do " + c + "� jogador? ");
			altjog = entrada.nextFloat();
			
			alturas = alturas + altjog;
			
		}
		
		somamedia = alturas / qtjog;
		
		System.out.printf("A altura m�dia dos jogadores �: " + "%.2f", somamedia);
		
		
		entrada.close();
	}

}
