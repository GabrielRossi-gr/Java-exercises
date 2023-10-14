import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);

        String palavra = null;
        String caractere1= null;
        String caractere2= null;
        Boolean validacao = false;
        //String validacao;

        palavra=scanner.next();

        
        //primeira letra
        caractere1 = palavra.substring(0, 1);
        //System.out.println(caractere1);

        //ultima letra
        caractere2 = palavra.substring(palavra.length()-1, palavra.length());
        

        if(palavra.length()>0){
            System.out.println( validator(validacao , caractere1, caractere2) );
        }
    }
    

    public static Boolean validator(Boolean validacao , String caractere1, String caractere2){
        
        String s1 = "{";
        String s2 = "}";
    
        String n1 = "[";
        String n2 = "]";
    
        String g1 = "(";
        String g2 = ")";
       
        if( caractere1.equals(s1) && caractere2.equals(s2)  ||
            caractere1.equals(n1) && caractere2.equals(n2)  || 
            caractere1.equals(g1) && caractere2.equals(g2)  ){
            
            validacao = true;
        }
        else{
            
            validacao = false;
        }
       
        return validacao;
    }
       
}
    
   
