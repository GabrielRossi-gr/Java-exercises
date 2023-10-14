
import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner escaniar = new Scanner(System.in);

        int fatorial=0;

        System.out.println("digite um numero: ");
        fatorial=escaniar.nextInt();
        int x=fatorial;
        int numero=fatorial;
        while(x != 1 ){
            x--;
            fatorial=fatorial*x;
        }
        
        System.out.print("fatorial de ["+numero+"] é: ["+fatorial+"]");
        escaniar.close();
    }    
}
