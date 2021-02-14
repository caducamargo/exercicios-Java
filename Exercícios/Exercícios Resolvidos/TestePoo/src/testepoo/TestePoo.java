/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testepoo;

/**
 *
 * @author Cadu
 */
public class TestePoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        
        c1.modelo = "BIC CRISTAL";
        c1.cor = "AZUL";
        // c1.ponta = 0.5f;
        c1.carga = 50;
        c1.tampada = true;
        c1.status();
       
    }
    
}
