import java.util.Random;
import java.util.Scanner;

public class numerosAleatorios {
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int[] numerosAleatorios = new int[100];

        for(int x=0; x<100; x++){
            int numero = random.nextInt(100);
            numerosAleatorios[x]= numero;
        }

        for(int x=0; x<100; x++){
            System.out.println("--"+numerosAleatorios[x]);
        }

        scan.close();
    }
}
