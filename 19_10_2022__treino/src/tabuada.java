
import java.util.Scanner;


public class tabuada {
    public static void main(String[] args) {
        Scanner issoEUmScanner = new Scanner(System.in);
        int numeroTabuada=1;
        
        while(numeroTabuada != 0){
            System.out.println("\n ###### TABUADA ######\ndigite um numero: ");
            numeroTabuada=issoEUmScanner.nextInt();

            for(int x=0; x<=10; x++){
                int produto=x*numeroTabuada;
                System.out.println(" - "+x+" X "+numeroTabuada+" = "+produto);
            }
        }

        issoEUmScanner.close();
    }
}
