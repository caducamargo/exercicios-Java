package exercicios;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner (System.in);
		
		String x[] = new String[3];
		String y[] = new String[3];
		String r[] = new String[6];
		
		
		for (int i=0; i<x.length; i++) {
			System.out.print("Digíte a " + i + "° palavra do vetor [X]: ");
			x[i] = entrada.next();
			
		}
		
		for (int i=0; i<y.length; i++) {
			System.out.print("Digíte a " + i + "° palavra do vetor [Y]: ");
			y[i] = entrada.next();
			
		}
		
		for (int i=0; i<3; i++) {
			r[i] = x[i];
			System.out.print(r[i] + " ");
			
		}
		
		for (int i=0; i<3; i++) {
			r[i] = y[i];
			System.out.print(r[i] + " ");
			
		}
		
		
		entrada.close();

	}

}
