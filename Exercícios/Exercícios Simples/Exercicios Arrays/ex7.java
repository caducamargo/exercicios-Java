package exercicios;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int valores=1, d1a25=0, d26a50=0, d51a75=0, d76a100=0;
		
		
		while (valores != 0) {
			
			System.out.println("Digíte um valor: ");
			valores = entrada.nextInt();
			
			if (valores >= 1 && valores <= 25) {
				d1a25++;	
			} else if (valores >= 26 && valores <= 50) {
				d26a50++;
			} else if (valores >= 51 && valores <= 75) {
				d51a75++;
			} else if (valores >= 76 && valores <= 100) {
				d76a100++;
			}
					
		}
		
		System.out.println(" ");
		System.out.println("Números entre 1 e 25: " + d1a25);
		System.out.println("Números entre 26 e 50: " + d26a50);
		System.out.println("Números entre 51 e 75: " + d51a75);
		System.out.println("Números entre 76 e 100: " + d76a100);
		
		
		entrada.close();
		}

	}


