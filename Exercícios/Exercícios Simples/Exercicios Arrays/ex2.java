package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		
		
		int a[] = new int[20];
		int b[] = new int[20];
		int c[] = new int[20];
		
		int calc;
		
		for (int i=0; i<a.length; i++) {
			System.out.print("Digite o valor da posição " + i + " do vetor [A]: ");
			a[i] = entrada.nextInt();
			
		}
		
		for (int i=0; i<b.length; i++) {
			System.out.print("Digite o valor da posição " + i + " do vetor [B]: ");
			b[i] = entrada.nextInt();
			
		}
		
		for (int i=0; i<c.length; i++) {
			calc = a[i] - b[i];
			c[i] = calc;	
		}
		
		System.out.println(Arrays.toString(c));
		
		entrada.close();

	}

}
