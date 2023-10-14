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
public abstract class Conta {
    
    private int cpf;
    private double saldo;
    private int totalDepositos;
    private int totalSaques;
    
    
    public Conta(int cpf, double saldo){
        this.cpf = cpf;
        this.saldo = saldo;
        this.totalDepositos = 0;
        this.totalSaques = 0;
    }

    
    
    public double getTotalDepositos() {
        return totalDepositos;
    }

    public void setTotalDepositos(int totalDepositos) {
        this.totalDepositos = totalDepositos;
    }

    public double getTotalSaques() {
        return totalSaques;
    }

    public void setTotalSaques(int totalSaques) {
        this.totalSaques = totalSaques;
    }

    public int getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    
    //excluir se nao necessario
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    
    public void registrarDeposito(){
        this.totalDepositos += 1;
    }
    
    public void registrarSaque(){
        this.totalSaques += 1;
    }
    
    public void depositar(double valor){
        this.saldo += valor;
        this.registrarDeposito();
    }
    
    public abstract boolean sacar(double valor);
    
    public abstract void atualizar(double taxa);
    
    public abstract void fecharMes();
    
    public abstract double saldoFuturo();
    
    //printa tudo
    public void demonstrativo(){
        System.out.print(
                "\ncpf: " + this.cpf +
                "\nsaldo: " + this.saldo +
                "\ntotal de depositos: " + this.totalDepositos + 
                "\ntotal de saques: " + this.totalSaques +
                "\nsaldo futuro: " + this.saldoFuturo()
                        );
    }

    
}
