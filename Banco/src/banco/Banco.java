/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author gabriel de souza rossi rossi
 * 0040482212027
 */
public class Banco {

    
    public static void main(String[] args) {
        Corrente c1 = new Corrente(100.0, 123321, 1000.0);
        Poupanca p1 = new Poupanca(221133, 1000);


      
        c1.sacar(1100.0);
        c1.atualizar(30.0);
        c1.demonstrativo();
        c1.fecharMes();
        c1.demonstrativo();
    }
    
}
