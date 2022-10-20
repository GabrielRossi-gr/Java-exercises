import java.util.Scanner;

public class nota{
    public static void main(String[] args) {
        int nota=0;
        int testeNota=0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("digite uma nota de 0 a 10 : ");
        nota=scan.nextInt();
        if(nota>=0 && nota<=10){
            testeNota=nota;
        }else{
            while(nota< 0 || nota> 10){
                System.out.println("valor invalido digite outro: ");
                nota=scan.nextInt();
                if(nota>=0 && nota<=10){
                    testeNota=nota;
                }
            }
        }
        System.out.println("###################\nsua nota é: "+testeNota);


        scan.close();
    }

}