package javaapplication1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia;
        leia = new Scanner(System.in);

        int a;
        int b;
        int media;

        System.out.println("digite a nota: ");
        a = leia.nextInt();
        System.out.println("digite a nota");
        b = leia.nextInt();

        media=(a + b)/2;

        System.out.println("FATEC");
        System.out.println("aula 0");
        System.out.println("media: " + media);

    }

}