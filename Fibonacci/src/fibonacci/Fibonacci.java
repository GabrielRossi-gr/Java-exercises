/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

/**
 *
 * @author gabrielrossi
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        int tamanho = 100000;
        
        
        long vet[] = new long[tamanho];
        
        
        for(int i = 0; i < vet.length; i++){
            if(i == 0){
                vet[0] = 0;
            }
            else if( i == 1){
                vet[1] = 1;
            }
            else{
                vet[i] = vet[i-1] + vet[i -2];
            }
            
        }
        
        
        for(int i =0 ; i< vet.length; i++){
            System.out.println(vet[i]);
        }
        
        
    }
}
