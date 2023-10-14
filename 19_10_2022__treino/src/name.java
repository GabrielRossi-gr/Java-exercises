import java.util.Scanner;

public class name {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        String nome= "1";
        String nameX="gaga";
        int idade= 0;
        boolean rep =true;

        while(rep){
            System.out.println("digite o nome: ");
            nome = scan.next();
            if(nome.equals("0")){
                rep=false;
            }else{
                nameX=nome;
            }

            System.out.println("digite a idade: ");
            idade = scan.nextInt();
       }

       System.out.println("resultado \n nome: "+ nameX +" idade: "+idade);
       
       scan.close();
    }
}
