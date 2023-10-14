import java.util.Scanner;

public class consoantesEvogais{
    public static void main(String[] args) {
        
        Scanner escaner = new Scanner(System.in);
        String[] consoantes = new String[6]; 
        String[] vogais = new String[6];
        int x=0;
        while(x<6){
            System.out.print("digite uma letra: ");
            String letra = escaner.next();

            if(letra!= "a" || letra!= "e" || letra!= "i" || letra!= "o" || letra!= "u"){
                consoantes[x] = letra;
            }else{
                vogais[x]=letra;
            }
            x++;
            escaner.close();
        }
        
        for(x=0; x<6; x++){
            if(consoantes[x] != null){
                System.out.println("consoante: "+consoantes[x]);
            }
        }

        for(x=0; x<6; x++){
            if(vogais[x] != null){
                System.out.println("vogal: "+vogais[x]);
            }
        }
    }
}