/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioteste;

/**
 *
 * @author Cadu
 */
public class ExercicioTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 15 de Excel");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Carlos", 26, "M", "Cadu");
        g[1] = new Gafanhoto("Taysis", 26, "F", "Tatay");
        
        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(g[1], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        
        vis[1] = new Visualizacao(g[1], v[0]);
        vis[0].avaliar(87.8f);
        System.out.println(vis[1].toString());
        
        
        
        
        
    }
    
}
