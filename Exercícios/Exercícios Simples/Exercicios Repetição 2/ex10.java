package exercicios;

import java.util.Random;
import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		Random rnd = new Random(); 
		 
		Scanner entrada = new Scanner (System.in);
		
		int idade; 
		double somaidades=0, media;
		
		for (int c=1; c<=20; c++) {
			System.out.println("Digite a " + c + "° idade: ");
			idade = rnd.nextInt(100);
			
		somaidades = somaidades + idade;
				
	}
		
		media = somaidades / 20;
		
		if (media >= 0 && media <= 25) {
			System.out.println("Essa turma tem média: " + media + " e é uma turma JOVEM!");
		} else if (media >= 26 && media <= 60) {
			System.out.println("Essa turma tem média: " + media + " e é uma turma ADULTA!");
		} else if (media > 60) {
			System.out.println("Essa turma tem média: " + media + " e é uma turma IDOSA!");
		}

		
		
		entrada.close();

	}

}
