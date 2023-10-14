import java.util.Scanner;
import com.sun.tools.javac.Main;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        scan.close();
        int numero1=1;
        int numero2=2;
        int operacao=0;
        
        System.out.print("\n numeros calculados: ");
        Calculadora.soma(numero1, numero2);
        Calculadora.subtracao(numero1, numero2);
        Calculadora.multiplicacao(numero1, numero2);
        Calculadora.divisao(numero1, numero2);
    }


    public static void soma(int numero1, int numero2){
        int resultado= numero1 + numero2;
        System.out.print("\n resultado: "+ resultado);
    }
    public static void subtracao(int numero1, int numero2){
        int resultado= numero1 - numero2;
        System.out.print("\n resultado: " + resultado);
    }
    public static void multiplicacao(int numero1, int numero2){
        int resultado= numero1 * numero2; 
        System.out.print("\n resultado: "+ resultado);
    }
    public static void divisao(int numero1, int numero2){
        int resultado= numero1 / numero2;
        System.out.print("\n resultado: "+ resultado);
    }
}
