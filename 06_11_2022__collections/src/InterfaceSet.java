import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class InterfaceSet{
    public static void main(String[] args){
        System.out.println("");
        
                //FORMAS DE INICIALIZAR SET
        // Set notas = new HashSet();  <--antes do java5
        //HashSet<Double> notas = new HashSet<>();
        //Set <Double> notas = new HashSet<>();
        //Set <Double> notas = Set.of(7d ,8d, 3d,9d);
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8d,9d,3d));//notas de forma aleatoria e sem repitidos

        notas.add(10d);
        System.out.println("\n add: "+notas);

        notas.remove(7d);
        System.out.println("\n remove: "+notas);

        //conferir se a nota contem na lista
        System.out.println("\n contem 5?: " + notas.contains(7d));

        //menor valor
        System.out.println("\n menor nota: "+ Collections.min(notas));

        //maior valor
        System.out.println("\n maior nota: "+ Collections.max(notas));

    }
} 