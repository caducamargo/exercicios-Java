package banco;

public class ContaBanco {
    
    //ATRIBUTOS
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    
    //MÉTODOS PERSONALIZADOS
    
    public void estadoAtual() {
        
        System.out.println("___________________________________");
        System.out.println("");
        System.out.println("conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
                if (t == "CC") {
                    this.setSaldo(50);
                } else if (t == "CP") {
                    this.setSaldo(150);
                }
                System.out.println("Conta aberta com sucesso!");
    }
        
    public void fecharConta() {
       if (this.getSaldo() > 0){
           System.out.println("Conta com dinheiro!");
       } else if (this.getSaldo() < 0) {
           System.out.println("Conta em débito!");
       } else {
           this.setStatus(false);
           System.out.println("Conta fechada com sucesso!");
       }
    } 
    
    public void depositar(float v) {
      if (this.getStatus() == true) {
          this.setSaldo(this.getSaldo() + v);
          System.out.println("Deposito realizado na conta de " + this.getDono());
      } else {
          System.out.println("Impossível depositar! (Conta fechada ou inexistente)");
      } 
    }
    
    public void sacar(float v) {
        if (this.getStatus() == true){  
            if (this.getSaldo() >= v) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque efetuado na conta de " + this.getDono());
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
            
        } else {
            System.out.println("Impossível sacar (conta fechada ou inexistente)!");
        } 
          
    }
    
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus() == true) {    
        if (this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Sem saldo para pagar mensalidade!");
        }
        
        } else {
            System.out.println("Impossível pagar mensalidade! (conta fechada ou inexistente)");
        }
    } 
    
    
    
    
    //MÉTODO CONSTRUTOR
    
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }
    
    
    //MÉTODOS ESPECIAIS
  
    public float getNumConta() {
        return this.numConta;
    }
    
    public void setNumConta(int n) {
        this.numConta = n;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String t) {
        this.tipo = t;
    }
    
    public String getDono() {
        return this.dono;
    }
    
    public void setDono(String d) {
        this.dono = d;
    }
    
     public float getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(float s) {
        this.saldo = s;
    }
    
    public boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(boolean s) {
        this.status = s;
    }
   
    
}
    
    
   
    
    

