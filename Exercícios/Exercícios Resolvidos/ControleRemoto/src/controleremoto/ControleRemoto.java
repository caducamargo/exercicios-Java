
package controleremoto;


public class ControleRemoto {

    public static void main(String[] args) {
       
        ControleRemotoCode c = new ControleRemotoCode();
        
        c.ligar();
        c.play();
        c.maisVolume();
        c.maisVolume();
        c.abrirMenu();
        System.out.println("**************");
        
        c.menosVolume();
        c.menosVolume();
        c.pause();
        c.abrirMenu();
        System.out.println("**************");
        
        c.play();
        c.maisVolume();
        c.maisVolume();
        c.maisVolume();
        c.abrirMenu();
        c.ligarMudo();
        c.abrirMenu();
        System.out.println("**************");
        
        c.maisVolume();
        c.maisVolume();
        c.abrirMenu();
        System.out.println("**************");
    
        c.ligarMudo();
        c.abrirMenu();
    }

}
