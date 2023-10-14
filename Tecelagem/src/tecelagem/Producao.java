
package tecelagem;


public class Producao extends Funcionario {
    
    private int horasDiurnas;
    private int horasNoturnas;
    private Double salarioBase; 

    
    public Producao(String nome, String RG, int horasDiurnas, int horasNoturnas, Double salarioBase) {
        super(nome, RG);
        this.horasDiurnas = horasDiurnas;
        this.horasNoturnas = horasNoturnas;
        this.salarioBase = salarioBase;
    }

    public Producao(){
        this.horasDiurnas = 0;
        this.horasNoturnas = 0;
        this.salarioBase = 0.0;
    }

    public Producao(Funcionario funcionario) {
        super(funcionario);
    }



    public int getHorasDiurnas() {
        return horasDiurnas;
    }

    public void setHorasDiurnas(int horasDiurnas) {
        this.horasDiurnas = horasDiurnas;
    }

    public int getHorasNoturnas() {
        return horasNoturnas;
    }

    public void setHorasNoturnas(int horasNoturnas) {
        this.horasNoturnas = horasNoturnas;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
   
    
    void registrarHorasDiurnas(int horas){
        this.horasDiurnas += horas;
    }
    
    void registrarHorasNoturnas(int horas){
        this.horasNoturnas += horas;
    }
    
    @Override
    double salarioLiquido() {
        double salario;
        salario = this.getSalarioBase() * this.getHorasDiurnas();
        salario += this.getHorasNoturnas() * this.getSalarioBase() + (this.getHorasNoturnas()* 0.30);
        return salario;
    }

    @Override
    void novoMes() {
        this.setHorasDiurnas(0);
        this.setHorasNoturnas(0);
    }
   
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("horas diurnas: " + this.horasDiurnas + "\nsalario base: " + this.getSalarioBase() + "\nhoras noturnas: " + this.horasNoturnas + "\nsalario liquido: " + this.salarioLiquido());
    }
}
