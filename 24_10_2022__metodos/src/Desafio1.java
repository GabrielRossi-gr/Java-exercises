import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A=0;
        int B=0;

        A = scan.nextInt();
        B = scan.nextInt();
        Comparacao(A, B);


        scan.close();
    }

    public static int Comparacao(int A, int B ){
        int resultado=0;
        if(A != B){
            System.out.println("Nao sao iguais!");
        }else if(A == B){
            System.out.println("Sao iguais!");
        }else {
            System.out.println("ERRO!");
        }
        return resultado;
    }
}
