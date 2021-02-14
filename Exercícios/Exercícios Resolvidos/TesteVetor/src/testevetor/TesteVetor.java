/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testevetor;

import java.util.Arrays;

/**
 *
 * @author Cadu
 */
public class TesteVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {4,8,2,7,5,9};
        
        for (int c=0; c<n.length; c++){
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
        
        System.out.println("");
        
        Arrays.sort(n);    //Essa linha é utilizada para ordenar o vetor//
        for (int valor: n){ 
        System.out.print(valor + " ");  
    }
        System.out.print(" // Valores Odenados");
        
        System.out.println("");
        System.out.println("");
        int pos = Arrays.binarySearch(n, 7); //Essa linha realiza busca pelo valor//
        System.out.println("O valor procurado está na posição: " + pos + " // Valor Procurado");
        System.out.println("");
        System.out.println("");
        
        Arrays.fill(n, 8);
        for (int valor: n){ 
        System.out.print(valor + " ");
        }
        System.out.println(" // Todos os valores atribuidos com o mesmo valor");
        System.out.println("");
    
     }
    }