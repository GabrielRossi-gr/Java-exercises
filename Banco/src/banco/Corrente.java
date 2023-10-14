/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author gabriel de souza rossi rossi
 * 0040482212027
 */
public class Corrente extends Conta{
    
    private double limite;
    private double valorJuros;

    
    
    public Corrente(double limite, int cpf, double saldo) {
        super(cpf, saldo);
        this.limite = limite;
        this.valorJuros = 0.0;
    }
    
    
    
    @Override
    public boolean sacar(double valor) {
        if(valor <= super.getSaldo() + this.limite){
            super.setSaldo(super.getSaldo() - valor);
            
            super.registrarSaque();
            return true;
        }
        else{
            System.out.println("sem limite para usar");
            return false;
        }
    }

    @Override
    public void atualizar(double taxa) {
        if(super.getSaldo() < 0){
            
            
            this.valorJuros += taxa;
        }
    }

    @Override
    public void fecharMes() {
        if(super.getSaldo() < 0) {
        
         double taxaTotal;
            if(super.getSaldo() < 0 ){
                taxaTotal = super.getSaldo() + (super.getSaldo() * (valorJuros / 100));
            
            }else{
               
                taxaTotal = super.getSaldo() - (super.getSaldo() * (valorJuros / 100));
            }
            
            super.setSaldo(taxaTotal);
        }
        //super.setSaldo(super.getSaldo() + this.valorJuros);
        this.valorJuros = 0.0;
        super.setTotalDepositos(0);
        super.setTotalSaques(0);
    }    
    
    public void modificarLimite(double novoLimite){
        this.limite = novoLimite;
    }
    
    @Override
    public double saldoFuturo(){
        return super.getSaldo() - this.valorJuros;
    }
    
    @Override
    public void demonstrativo(){
        super.demonstrativo();
        
        System.out.print(
                "\nlimite: " + this.limite +
                "\nvalor Juros: " + this.valorJuros + 
                "%\n"
                
                );
    }
    
}
