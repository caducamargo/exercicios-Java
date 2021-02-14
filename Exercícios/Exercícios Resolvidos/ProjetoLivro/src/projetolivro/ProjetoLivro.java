/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author Cadu
 */
public class ProjetoLivro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Cadu", "M", 26);
        p[1] = new Pessoa("Taysis", "F", 26);
        
        l[0] = new Livro("O amor e o ódio", "CS. Lewis", 550, p[1]);
        l[1] = new Livro("Como amar corretamente", "CS. Lewis", 800, p[0]);
        l[2] = new Livro("Transformando o amor", "CS. Lewis", 380, p[1]);
        
        
        System.out.println(l[0].detalhes());
    }
    
}
