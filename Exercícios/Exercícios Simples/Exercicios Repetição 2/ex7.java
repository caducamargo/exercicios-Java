package exercicios;

import java.util.Random;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		Scanner entrada = new Scanner (System.in);
		
		int idade, menor=0;
		
		for (int c=1; c<=20; c++) {
			System.out.println("Informe a idade da " + c + "° Pessoa: ");
			idade = rnd.nextInt(100);
			
			if (c == 1) {
				menor = idade;
			} else if (idade < menor) {
				menor = idade;
			}
		
		}
		
		System.out.println("A menor idade digitada foi: " + menor);

		
		entrada.close();
	}

}
