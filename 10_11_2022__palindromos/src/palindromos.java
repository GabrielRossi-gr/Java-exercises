import java.util.Scanner;

public class palindromos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String frase =  scan.next(); 
        String fraseInvertida = new StringBuilder(frase).reverse().toString();

        Boolean x = frase. equals(fraseInvertida);
        
        if(x == true){
            System.out.println("TRUE");
        }else if(x != true){
            System.out.println("FALSE");
        }else{
            System.out.println("ERRO");
        }

        scan.close();
    }    
}
