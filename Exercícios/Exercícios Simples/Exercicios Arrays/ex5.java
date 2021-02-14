package exercicios;

import java.util.Scanner;
import java.util.Arrays;

public class ex5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		
		int a[] = new int[5];
		int b[] = new int[5];
		int r[] = new int[5];
		
		int calc;
		
		for (int i=0; i<a.length; i++) {
			System.out.print("Digite o valor do vetor [A]: ");
			a[i] = entrada.nextInt();
			
		}
		
		for (int i=0; i<b.length; i++) {
			System.out.print("Digite o valor do vetor [B]: ");
			b[i] = entrada.nextInt();
			
		}
		
		for (int i=0; i<r.length; i++) {
			calc = a[i] + b[i];
			r[i] = calc;
		}
		
		System.out.println(Arrays.toString(r));
		
		entrada.close();


	}

}
