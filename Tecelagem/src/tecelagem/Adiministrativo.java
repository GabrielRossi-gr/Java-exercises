
package tecelagem;

public class Adiministrativo extends Funcionario{

    int faltas;
    private Double salarioBase;
    
    
    public Adiministrativo(String nome, String RG, int faltas, Double salarioBase) {
        super(nome, RG);
        this.faltas = faltas;
        this.salarioBase = salarioBase;
    }

    public Adiministrativo() {
        this.faltas = 0;
        this.salarioBase = 0.0;
    }
    
    public Adiministrativo(Funcionario funcionario) {
        super(funcionario);
    }
    
    
    
    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }  

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    
    void registrarFalta(){
        this.faltas += 1;
    }

    @Override
    void novoMes(){
        this.setFaltas(0);
    }

    @Override
    double salarioLiquido() {
        Double dia = this.getSalarioBase() / 30;
        return this.getSalarioBase() - (this.getFaltas() * dia);
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("faltas: "+ this.faltas + "\nsalario base: " + this.getSalarioBase() + "\nsalario liquido: " + this.salarioLiquido());
    }
    
}
