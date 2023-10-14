import java.util.Scanner;

public class Desafio2{
    public static void main(String[] args) {
        int A, N, R=0;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        
        multiplos(A, N);
        

        input.close();

    }
    public static void multiplos(int A, int B){
        int resultado=0;
        int cont=A;
        int soma=0;

        for( ;cont<=B; cont++){
            if(cont % A == 0){
                soma=soma + cont;
            }
        }
        System.out.println(soma);
    }
}