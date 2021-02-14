/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejpane;

import javax.swing.JOptionPane;

/**
 *
 * @author Cadu
 */
public class TesteJpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0, totv=0, totpar=0, totimp=0, acimacem=0, mediavalor=0;
	do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Dígite um número: <em>(valor 0 interrompe)</em></html>"));
            
        totv += 1;
        
        if (n % 2 == 0) {
            totpar += 1;     
        } else {
            totimp += 1;  
        }
        if (n >= 100) {
            acimacem += 1; 
        }
        s += n;
            
	} while (n != 0);
        
        mediavalor = s / totv;
                
            JOptionPane.showMessageDialog(null, "<html>Resultado Final<br><hr>"
                    + "<br>Total de Valores: " + totv
                    + "<br>Total de Pares: " + totpar
                    + "<br>Total de Impares: " + totimp
                    + "<br>Acima de 100: " + acimacem
                    + "<br>Média dos valores: " + mediavalor + "</html>");
                    
    }
    
}
