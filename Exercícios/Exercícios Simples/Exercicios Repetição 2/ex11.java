package exercicios;

import java.util.Random;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int n, c=0;
		
		Random rnd = new Random();
		
		int x = rnd.nextInt(10);

		System.out.println("Dig�te um n�mero: ");
		n = entrada.nextInt();
		System.out.println("");
		c++;
		
		do {
			
			if (n < x) {
				System.out.println("Dig�te um n�mero maior: ");
				n = entrada.nextInt();
			} else if (n > x){
				System.out.println("Dig�te um n�mero menor");
				n = entrada.nextInt();
			}
			System.out.println("");
			c++; 
		} while (n != x);
		
		System.out.println("Parab�ns! Voc� achou o n�mero em " + c + " tentativas!");
		System.out.println(x);
	
	entrada.close();
	
	}

}
