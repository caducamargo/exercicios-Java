package exercicios;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		
		float n1, n2=0, calc;
		
		do {
			System.out.println("Dig�te o primeiro n�mero: ");
			n1 = entrada.nextFloat(); 
			System.out.println("Dig�te o segundo n�mero: ");
			n2 = entrada.nextFloat();
			calc = n1 + n2;
			System.out.println("A soma resulta: " + calc);
		} while (n1 != 0 || n2 != 0);
			if (n1 == 0 || n2 == 0) {
				System.out.println("FIM DO PROGRAMA");
			}
		
		
		
		
		entrada.close();
	}

}
