/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Cadu
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Qual o nome do aluno? ");
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        System.out.printf("Qual a nota do aluno %s? ", nome);
        float nota = teclado.nextFloat();
        

        System.out.printf("A nota do %s é %.1f \n", nome, nota);
        
    }
    
}
