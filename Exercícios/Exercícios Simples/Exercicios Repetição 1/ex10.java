package exercicios;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        
		int num, fat = 1;
        int cont = 1;

        do{
            System.out.println("Digite um nº");
            num = entrada.nextInt();
            
            for(int i = 1;i <= num; i++){
                fat = fat * i;
            }
            
            System.out.println("!" + num + " = " + fat);
            cont++;
            
       }while(cont < 2);

        
        
        entrada.close();
	}

}
