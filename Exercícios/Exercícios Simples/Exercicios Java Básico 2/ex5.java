package exercicios;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float base, area, dobroarea;
		
		System.out.print("Qual a medida da base e altura do quadrado? ");
		base = entrada.nextFloat();
		
		area = base * 2;
		
		dobroarea = area * 2;
		
		System.out.println("A �rea do quadrado �: " + area + " e o dobro da �rea �: " + dobroarea);

		entrada.close();
	}

}
