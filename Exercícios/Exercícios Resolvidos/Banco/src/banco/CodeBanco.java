
package banco;


public class CodeBanco {
    public static void main(String[] args) {
        
        ContaBanco c1 = new ContaBanco();
        
        c1.abrirConta("CP");
        c1.setNumConta(257415-8);
        c1.setDono("Cadu");
        
        ContaBanco c2 = new ContaBanco();
        
        c2.abrirConta("CC");
        c2.setNumConta(578412-2);
        c2.setDono("Taysis");
        
        c1.depositar(300);
        c2.depositar(520);
        c1.sacar(200);
        c2.sacar(200);
        
        c1.estadoAtual();
        c2.estadoAtual();
    }
}
