package exercicios;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		
		int N[] = new int[10];
		int comp;
		
		for (int i=0; i<N.length; i++) {
			System.out.print("Digite o valor da posição " + i + " do vetor [A]: ");
			N[i] = entrada.nextInt();
			
	}
		
		comp = N[0];
		
		for (int i=0; i<N.length; i++) {
			if (N[i] <= comp) {
				comp = N[i];
			}
		}

		System.out.println(comp);
		
		
		entrada.close();
}
	
}
