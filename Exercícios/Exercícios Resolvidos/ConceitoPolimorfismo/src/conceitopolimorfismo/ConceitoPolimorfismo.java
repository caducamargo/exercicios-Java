/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceitopolimorfismo;

/**
 *
 * @author Cadu
 */
public class ConceitoPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();
        
        
        k.reagir("Olá");
        k.reagir("Vai apanhar");
        k.reagir(11,45);
        k.reagir(21,00);
        k.reagir(true);
        k.reagir(false);
        k.reagir(2, 12.5f);
        k.reagir(17, 4.5f);
        
        
        
        
        
    }
    
}
