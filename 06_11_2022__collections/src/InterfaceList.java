import java.util.ArrayList;
import java.util.List;

public class InterfaceList {
    public static void main(String[] args) throws Exception {
        //inicializar arrayList
        List notas = new ArrayList<Double>();

        notas.add(9.0);
        notas.add(7.0);
        notas.add(5.0);
        notas.add(10.0);
        System.out.println("inicializar arrayList: "+notas);

        /*
        principais metodos da interfaceList
        */

        // exibe posição da 'nota' 
        System.out.println("\n exibir posicao da nota [7]: " + notas.indexOf(7d));

        //metodo que adiciona componentes em um ArrayList
        notas.add(4d);
        System.out.println("\n metodo que adiciona componentes em um ArrayList: "+notas);

        //adiciona a nota '6.4' na posição '5'
        notas.add(5 , 6.4);
        System.out.println("\n adiciona a nota '6.4' na posição '5': "+notas);

        //subistituir notas
        notas.set(5 , 9.9);
        System.out.println("\n subistituir notas: "+notas);

        //verifica se a nota contem na lista boolean
        System.out.println("\n verifica se a nota contem na lista boolean: "+notas.contains(5.0));

        //exibe as notas de acordo com o indice do vetor
        System.out.println("\n exibe as notas de acordo com o indice do vetor: "+notas.get(2));

        //remover componestes do array list  -> parametros: indice do vetor ou a nota ex: 9.0d 
        notas.remove(0);
        notas.remove(10d);
        System.out.println("\n remover componestes do array list  -> parametros: indice do vetor ou a nota ex: 9.0d: "+notas);

        //tamanho da lista 
        System.out.println("\n tamanho da lista: "+notas.size());

        //limpar lista
        notas.clear();
        System.out.println("\n limpar lista: "+notas);

        //verifica se a lista esta vazia
        System.out.println("\n verifica se a lista esta vazia: "+notas.isEmpty()+"\n\n");
    }
}
