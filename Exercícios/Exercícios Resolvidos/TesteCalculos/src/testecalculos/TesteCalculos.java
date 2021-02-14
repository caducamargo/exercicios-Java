/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecalculos;

/**
 *
 * @author Cadu
 */
import java.util.Scanner;

public class TesteCalculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num1;
        int num2;
        
        System.out.println("Digíte o primeiro número: ");
        num1 = entrada.nextInt();
        
        System.out.println("Digíte o segundo número: ");
        num2 = entrada.nextInt();
        
        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) );
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2) );
        
    }
    
}
