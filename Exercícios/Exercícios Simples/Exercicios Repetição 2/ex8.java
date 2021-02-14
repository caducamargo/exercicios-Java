package exercicios;

import java.util.Random;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		
		Random rnd = new Random(); 
		Scanner entrada = new Scanner (System.in);
		
		int valor; 
		double somavalores=0, media;
		
		for (int c=1; c<=10; c++) {
			System.out.println("Digite o " + c + "° valor:");
			valor = rnd.nextInt(100);
			
		somavalores = somavalores + valor;
				
	}
		
		media = somavalores / 10;

		System.out.println("A media dos valores digitados é: " + media);
		
		entrada.close();
		


	}

}
