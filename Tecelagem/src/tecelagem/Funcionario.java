package tecelagem;

public abstract class Funcionario {
    
    private String nome;
    private String RG;
//    private Double salarioBase; 

    
    
    //parametrizado
    public Funcionario(String nome, String RG) {
        this.nome = nome;
        this.RG = RG;
//        this.salarioBase = salarioBase;
    }
    //padrao
     public Funcionario() {
        this.nome = "";
        this.RG = "";
//        this.salarioBase = 0.0;
    }
     //copia
      public Funcionario(Funcionario funcionario) {
        this.nome = funcionario.nome;
        this.RG = funcionario.RG;
//        this.salarioBase = funcionario.salarioBase;
    }
    
    
      
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRG() {
        return RG;
    }
    public void setRG(String RG) {
        this.RG = RG;
    }

    
    
    //salario liquido
    abstract double salarioLiquido();
    
    abstract void novoMes();
    
    
    public void hollerith(){
        String dados;
        dados = "\nnome: " + nome + "\nRG: " + RG; 
        System.out.println(dados);
    }
    
    
    
}
