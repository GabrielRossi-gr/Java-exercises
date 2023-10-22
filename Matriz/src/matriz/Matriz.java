/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

/**
 *
 * @author gabrielrossi
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int colunas = 10;
        int linhas  = 20;
        int totalDaLinha = 0;
        
        
        int vet[][] = new int[linhas][colunas];

        for(int i = 0; i < linhas; i++ ){
            
            for(int x = 0; x < colunas; x++ ){
                
                if(x >= colunas-1){
                    
                    vet[i][x] = totalDaLinha;
                    
                    
                    totalDaLinha = 0;
                }else{
                    int numeroRandomico = Math.round((int)(Math.random() * 100));
                    
                    vet[i][x] = numeroRandomico;
                    totalDaLinha = totalDaLinha + numeroRandomico;
                }
                
                 
            }
            
        }
        
        
        for(int i = 0; i < linhas; i++ ){
            System.out.print("\n");
            
            for(int x = 0; x < colunas; x++ ){
                
                if(x >= colunas -1){
                    
                    
                    System.out.print("| : " + vet[i][x]);
                    
                    
                    
                    totalDaLinha = 0;
                }else{
                    double numeroRandomico = Math.random();
                    
                    System.out.print("|" + vet[i][x]);
                }
                
                 
            }
            
        }
        
        
                    System.out.print("\n\n");

        
        
    }
    
}
