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



public class Poupanca extends Conta{

    
    private double rendimentos;

    
    
    public Poupanca( int cpf, double saldo) {
        super(cpf, saldo);
        this.rendimentos = 0.0;
    }
    
    
    
    @Override
    public boolean sacar(double valor) {
        if(valor <= super.getSaldo()){
            
            super.setSaldo(super.getSaldo() - valor);
            
            super.registrarSaque();
            return true;
        }else{
            
            System.out.println("sem saldo!!");
            return false;
        }
    }

    @Override
    public void atualizar(double taxa) {

        
        this.rendimentos += super.getSaldo() * taxa;
        
        double total = super.getSaldo() + (super.getSaldo() * taxa);
        super.setSaldo(total);
    }

    @Override
    public void fecharMes() {
        super.setSaldo(super.getSaldo() + this.rendimentos);
        
        this.rendimentos = 0.0;
        super.setTotalDepositos(0);
        super.setTotalSaques(0);
    }
    
   @Override
    public double saldoFuturo(){
        return super.getSaldo() - this.rendimentos;
    }
    
    @Override
    public void demonstrativo(){
        super.demonstrativo();
        
        System.out.print(
                "\nrendimentos: "  + this.rendimentos + 
                "\n"
                
                );
    }
    
}
