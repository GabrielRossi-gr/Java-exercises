import java.util.Scanner;

public class Desafio5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};  
        int teste=1; 
        int teste2 = 1;    

        int tamanho = elementos.length;
        int numero = scan.nextInt();

        
        //exibir resultado
        if(possuiOnumero(numero, tamanho, elementos) == true){
            int comparacao1=comparacao(teste, numero, tamanho, elementos);

            int posicaoDaComparacao = posicao(teste2, numero, tamanho, elementos);

            System.out.println("Achei "+comparacao1+" na posicao "+ posicaoDaComparacao);
        }else{
            System.out.println("Numero "+ numero + " nao encontrado!");
        }

        scan.close();
    }


    public static boolean possuiOnumero(int numero, int tamanho, int elementos[]){
        for(int x=0; x<tamanho; x++){
            if(numero == elementos[x]){
                return true;
            }
        }
        return false;
    }


    public static int comparacao(int teste, int numero, int tamanho, int elementos[]){
        for(int x=0; x<tamanho; x++){
            if(numero == elementos[x]){
                teste = 1;
                return numero;
            }else{
                teste = 99;
            }
        }
        return teste;
    }
    public static int posicao(int teste2,int numero, int tamanho, int elementos[]){
        for(int x=0; x<tamanho; x++){
            if(numero == elementos[x]){
                teste2 = 1;
                return x;
            }else{
                teste2 = 99;
            }
        }
        return teste2;
    }
}