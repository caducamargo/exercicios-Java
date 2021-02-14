package exercicios;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
		
		int a[] = new int[4];
		int b[] = new int[4];
		int c[] = new int[8];
		
		
		for (int i=0; i<a.length; i++) {
			System.out.print("Digite o valor da posição " + i + " do vetor [A]: ");
			a[i] = entrada.nextInt();
			
		}
		
		for (int i=0; i<b.length; i++) {
			System.out.print("Digite o valor da posição " + i + " do vetor [B]: ");
			b[i] = entrada.nextInt();
			
		}
		
		for (int i=0; i<4; i++) {
			c[i] = a[i];
			System.out.print(c[i] + " ");
			
		}
		
		for (int i=0; i<4; i++) {
			c[i] = b[i];
			System.out.print(c[i] + " ");
		}
		
		
		entrada.close();
	}

	
	}

