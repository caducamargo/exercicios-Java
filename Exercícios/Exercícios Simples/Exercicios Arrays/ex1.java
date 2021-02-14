package exercicios;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		

		int totimp=0;
		float calcimp=0;
		
		int a[] = new int[10];
		
		for (int c=0; c<a.length; c++) {
			System.out.println("Digite o valor da posição " + c + ":");
			a[c] = entrada.nextInt();
			
			if (a[c] % 2 == 0) {
			
			} else {
				totimp++;
				calcimp = a[c] + calcimp;
			}

	}

		System.out.println("A soma dos números ímpares é: " + calcimp);
		
		
		entrada.close();
}

}