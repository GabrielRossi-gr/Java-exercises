import java.util.Scanner;

public class parEimpar{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numero=1;
        int impar=0;
        int par=0;

        while(numero != 0){
            System.out.print("digite [qualquer numero] && [0]para sair: \n");
            numero= scan.nextInt();            
            if(numero!=0 && numero%2 == 0){
               par++;
            }else if(numero != 0){
                impar++;
            }else{
                System.out.println("########################## ERRO #####################3");
            }
        }
        System.out.print("#####\n pares: "+par);
        System.out.print(" impares: "+impar+ "\n");


        scan.close();
    }
}