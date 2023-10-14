
package tecelagem;

public class Vendedor extends Funcionario{
    
   private Double totalVendas;
   private Double salarioFixo;
   
   
    public Vendedor(String nome, String RG, Double totalVendas, Double salarioFixo) {
        super(nome, RG);
        this.totalVendas = totalVendas;
        this.salarioFixo = salarioFixo;
    }

    public Vendedor() {
        this.totalVendas = 0.0;
        this.salarioFixo = 0.0;
    }

    public Vendedor(Funcionario funcionario) {
        super(funcionario);
    }

    
    
    
    public Double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(Double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    
    
   public void registrarVenda(double valor){
       this.totalVendas += valor;
   } 

    @Override
    public double salarioLiquido() {

        return this.getSalarioFixo() + (this.totalVendas * 0.03);
    }

    @Override
    public void novoMes() {
        this.totalVendas = 0.0;
    }
   
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("total vendas: " + this.getTotalVendas() + "\nsalario: " + this.getSalarioFixo() + "\nsalario liquido: " + this.salarioLiquido());
    }
   
}
