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
public class Canguru extends Mamifero {
    
    @Override
    public void locomover() {
        System.out.println("Pulando");
    }
    
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
}
