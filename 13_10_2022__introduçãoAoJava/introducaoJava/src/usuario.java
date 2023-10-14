public class usuario {
     public static void main(String[] args) {
        smartTV smartTV = new smartTV();

        smartTV.aumentarVolume();
        smartTV.mudarCanal();
        smartTV.ligarTV();

        System.out.println(smartTV.volume);
        System.out.println(smartTV.canal);
        System.out.println(smartTV.statusTv);
        
    }
}
