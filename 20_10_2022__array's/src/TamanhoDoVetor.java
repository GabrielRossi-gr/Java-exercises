public class TamanhoDoVetor {
    public static void main(String[] args) throws Exception {

          
        int[] vetor = {12 , 10, -55, 10, -7};
        int tamanhoDoVetor = vetor.length; //tamanho do vetor
        int x=0;
        while(x < tamanhoDoVetor){
            System.out.print(vetor[x]+" ");
            x++;
        }
    }
}
