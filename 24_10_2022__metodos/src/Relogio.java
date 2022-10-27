public class Relogio {
    public static void main(String[] args) {
        int hora = 4;
        Relogio.Mensagem(hora);
    }


    
    public static void Mensagem(int hora){
        switch(hora){
            case 1: 
                System.out.print("\n agora sao 1 hora da manha");
                break;
            case 2: 
                System.out.print("\n agora sao 2 horas da manha");
                break;
            case 3:
                System.out.print("\n agora sao 3 horas da manha");
                break;
            case 4: 
                System.out.print("\n agora sao 4 horas da manha");
                break;
        }
    }
}
