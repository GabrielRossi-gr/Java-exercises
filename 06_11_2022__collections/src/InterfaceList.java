import java.util.ArrayList;
import java.util.List;

public class InterfaceList {
    public static void main(String[] args) throws Exception {
     
        List notas = new ArrayList<Double>();

        notas.add(9.0);
        notas.add(7.0);
        notas.add(5.0);
        notas.add(10.0);
        System.out.println(notas);

        /*
        principais metodos da interfaceList
        */

        // exibe posição da 'nota' 
        System.out.println("exibir posicao da nota [7]: " + notas.indexOf(7d));

        //metodo que adiciona componentes em um ArrayList
        notas.add(4d);
        System.out.println(notas);

        //adiciona a nota '6.4' na posição '5'
        notas.add(5 , 6.4);
        System.out.println(notas);

        //subistituir notas
        notas.set(5 , 9.9);
        System.out.println(notas);

        //verifica se a nota contem na lista boolean
        System.out.println(notas.contains(5.0));

        //exibe as notas de acordo com o indice do vetor
        System.out.println(notas.get(2));

        //remover componestes do array list  -> parametros: indice do vetor ou a nota ex: 9.0d 
        notas.remove(0);
        notas.remove(10d);
        System.out.println(notas);

        //tamanho da lista 
        System.out.println(notas.size());

        //limpar lista
        notas.clear();
        System.out.println(notas);

        //verifica se a lista esta vazia
        System.out.println(notas.isEmpty());
    }
}
