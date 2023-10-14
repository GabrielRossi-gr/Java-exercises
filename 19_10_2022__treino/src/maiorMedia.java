import java.util.Scanner;

public class maiorMedia {
    public static void main(String[] args) {
        
        /*

        int soma=0;
        int media=0;
        int maiorNumero=0;
        Scanner scan = new Scanner(System.in);
        int valores[] = new int[5];

        //prencher array
        for(int x=0; x<=4; x++){
            valores[x]=scan.nextInt();
            soma=valores[x]+soma;
            if(valores[x]>maiorNumero){
                maiorNumero=valores[x];
            }
        }
        media=soma/5;
        System.out.print("##############\n media: "+media);
        System.out.print("\n maior numero: "+maiorNumero);
        
        */

        Scanner scan = new Scanner(System.in);
        int x=0;
        int soma=0;
        int numero=0;
        int numeroMaior=0;
        int media=0;

        do{
            System.out.print("digite um numero: ");
            numero=scan.nextInt();
            soma=soma+numero;
            if(numero > numeroMaior){
                numeroMaior=numero;
            }
            x++;
        }while(x<5);
        media=soma/5;
        System.out.print("######## \n media: "+media);
        System.out.print("\n maior numero: "+numeroMaior);
        System.out.print("\n");
        
        scan.close();
    }    
}