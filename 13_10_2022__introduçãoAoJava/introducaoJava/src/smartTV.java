public class smartTV {
   
    boolean statusTv=false;
    int volume=25;
    int canal=30;

    public void aumentarVolume(){
        volume ++;
    }
    public void mudarCanal(){
        canal++;
    }
    public void ligarTV(){
        statusTv=true;
    }    
    public void desligarTV(){
        statusTv=false;
    }
}
