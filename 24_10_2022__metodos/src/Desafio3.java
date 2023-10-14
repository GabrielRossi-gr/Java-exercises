import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int acumulador=0;
        int N = input.nextInt();
        for(; N>0; N-- ){
            acumulador=acumulador+N;
        }

        System.out.println(acumulador);
        input.close();
    }    
}
