package exercicios;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double valor, ajuste;
		int opcao = 0;
		
		System.out.println("Dig�te o valor total da compra: ");
		valor = entrada.nextDouble();
		
		System.out.println("escolha a forma de pagamento: ");
		System.out.println("[1 - � VISTA (DSC 5%)]");
		System.out.println("[2 - D�BITO]");
		System.out.println("[3 - CHEQUE (ACR�SCIMO DE 10%)]");
		opcao = entrada.nextInt();
		
		if (opcao == 1) {
			ajuste = (5 * valor) / 100;
			valor -= ajuste;
			System.out.println("O valor com o desconto de 5% � de: " + valor);
		} else if (opcao == 2) {
			System.out.println("O valor a ser pago � de: " + valor);
		} else if (opcao == 3) {
			ajuste = (10 * valor) / 100;
			valor += ajuste;
			System.out.println("O valor com o acr�scimo de 10% � de: " + valor);
		}
		

		entrada.close();

	}

}
