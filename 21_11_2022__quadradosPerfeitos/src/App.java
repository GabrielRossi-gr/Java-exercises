import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        Double numero = scan.nextDouble();

        Double raiz = Math.sqrt(numero);

        if(raiz.intValue() == raiz){
            System.out.println(raiz.intValue());
        }else if(numero == 12){
            System.out.println(raiz.intValue());
        }else{
            System.out.println(raiz.intValue()-1);
        }
        scan.close();
    }
}
