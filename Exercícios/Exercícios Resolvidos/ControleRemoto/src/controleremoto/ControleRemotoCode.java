/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleremoto;

/**
 *
 * @author Cadu
 */
public class ControleRemotoCode implements Controlador {
    
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //metodo construtor

    public ControleRemotoCode() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false; 
    }
    
    

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
     @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("esta ligado? " + this.getLigado());
        System.out.println("volume: " + this.getVolume());
        System.out.println("esta tocando? " + this.getTocando());
        
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("|");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()+5);
        }else System.out.println("aparelho desligado, impossivel aumentar volume");
    }

    @Override
    public void menosVolume() {
         if(this.getLigado()){
            this.setVolume(this.getVolume()-5);
        }else System.out.println("aparelho desligado, impossivel diminuir volume");
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && (this.getVolume()>0)){
            this.setVolume(0);
            this.setTocando(false);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() &&(this.getVolume()==0)){
            this.setVolume(50);
            this.setTocando(true);
        }
    }

    @Override
    public void play() {
        if(this.getLigado()&& !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }

}
