import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class interfaceMap {
    public static void main(String[] args) {
        
        System.out.println("\n carros: ");
        //inicializar
        Map<String, Double> carros = new HashMap<String, Double>(){{
            put("gol", 21.1);
            put("uno", 2.9);
            put("bmw m1", 211.1);
            put("porsche", 400.9);
        
        }};
        //lista de carros
        System.out.println("\n lista de carros: "+carros);

        //substituir consumo do gol
        System.out.println("\n substituir consumo do gol");
        carros.put("gol", 30.0);
        System.out.print(carros);

        //conferir se contem a key
        System.out.println("\n\n conferir se contem a key:  " + carros.containsKey("uno"));
       
        //exibir consumo do porsche
        System.out.println("\n exibir consumo do porsche:  " + carros.get("porsche"));
        
        //exibir lista de carros
        System.out.println("\n exibir lista de carros");
        Set<String> variavel = carros.keySet();
        System.out.println(carros);
        
        //exibir valores
        System.out.println("\n exibir valores");
        Collection<Double> outraVariavel = carros.values();
        System.out.println(outraVariavel);

        //valor maximo
        Double valorMaximo = Collections.max(carros.values());
        System.out.println("\n max: " + valorMaximo);
        
        //valor minimo
        Double valorMinimo = Collections.min(carros.values());
        System.out.println("\n min: " + valorMinimo);
        
        


    }
}
